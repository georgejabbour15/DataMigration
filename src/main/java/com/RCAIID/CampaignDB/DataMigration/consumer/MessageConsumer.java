package com.RCAIID.CampaignDB.DataMigration.consumer;


import com.mbusa.VDA.ConsumerProducer.dto.CampaignVehiculeDlrAsgmt;
import com.mbusa.VDA.ConsumerProducer.writers.CampaignSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class MessageConsumer {

    @Autowired
    private CampaignSender sender;


    @Autowired
    private DataSource dataSource;


    @KafkaListener(topics = "${kafka.topic-name-consumer}", groupId = "${spring.kafka.consumer.group-id}")
    public void listen(@Payload com.mbusa.avro.dto.AvroObjectDTO avroObjectDTO, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
        System.out.println("record:" + avroObjectDTO);
        System.out.println("record1:" + avroObjectDTO.getCdeDlr().toString());
        SimpleJdbcCall jdbcCall = new
                SimpleJdbcCall(dataSource).withFunctionName("proc_dealer_assignment");

        SqlParameterSource in = new MapSqlParameterSource().addValue("_cde_dlr", avroObjectDTO.getCdeDlr())
                .addValue("_num_cmpgn",avroObjectDTO.getNumCmpgn())
                .addValue("_id_fin", avroObjectDTO.getIdFin())
                .addValue("_cde_ctry" ,avroObjectDTO.getCdeCtry())
                .addValue("_cde_cmpgn_typ", avroObjectDTO.getCdeCmpgnTyp())
                .addValue("_cde_dlr_asgmt_rule", avroObjectDTO.getCdeDlrAsgmtRule());
        CampaignVehiculeDlrAsgmt name = jdbcCall.executeFunction(CampaignVehiculeDlrAsgmt.class, in);


        System.out.println("record1:" + avroObjectDTO.getCdeDlr().toString());
//        sendToTopic(campaignVehiculeDlrAsgmt);
    }

    public void sendToTopic(  CampaignVehiculeDlrAsgmt campaignVehiculeDlrAsgmt){
        com.mbusa.avro.dto.CampaignVehiculeDealerAsgmtDTO e = com.mbusa.avro.dto.CampaignVehiculeDealerAsgmtDTO.newBuilder()
                .setCdeDlr(campaignVehiculeDlrAsgmt.getCde_dlr())
                .setNumCmpgn(campaignVehiculeDlrAsgmt.getNum_cmpgn())
                .setIdFin(campaignVehiculeDlrAsgmt.getId_fin())
                .setCdeCtry(campaignVehiculeDlrAsgmt.getCde_ctry())
                .setCdeCmpgnTyp(campaignVehiculeDlrAsgmt.getCde_cmpgn_typ())
                .setCdeDlrAsgmtRule(campaignVehiculeDlrAsgmt.getCde_dlr_asgmt_rule())
                .setDteVehGrnd(campaignVehiculeDlrAsgmt.getDte_veh_grnd().toString())
                .setIndVehLnch(campaignVehiculeDlrAsgmt.getInd_veh_lnch())
                .setIndVehCa(campaignVehiculeDlrAsgmt.getInd_veh_ca())
                .setDtsCrea(campaignVehiculeDlrAsgmt.getDts_crea().toString())
                .setIdCreaUser(campaignVehiculeDlrAsgmt.getId_crea_user())
                .setDtsLastUpdt(campaignVehiculeDlrAsgmt.getDts_last_updt().toString())
                .setIdLastUpdtUser(campaignVehiculeDlrAsgmt.getId_last_updt_user())
                .setIndOper(campaignVehiculeDlrAsgmt.getInd_oper())
                .build();
        sender.sendCampaignCustomer(e);
    }
}
