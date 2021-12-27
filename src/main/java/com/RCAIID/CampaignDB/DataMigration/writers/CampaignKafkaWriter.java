package com.RCAIID.CampaignDB.DataMigration.writers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class CampaignKafkaWriter {

    @Autowired
    private CampaignSender sender;

//    @Override
//    public void write(List<? extends CampaignVehiculeDlrAsgmt> list) {
//        for (CampaignVehiculeDlrAsgmt campaignVehiculeDlrAsgmt : list) {
//            com.mbusa.avro.dto.CampaignVehiculeDealerAsgmtDTO e = com.mbusa.avro.dto.CampaignVehiculeDealerAsgmtDTO.newBuilder()
//                    .setCdeDlr(campaignVehiculeDlrAsgmt.getCde_dlr())
//                    .setNumCmpgn(campaignVehiculeDlrAsgmt.getNum_cmpgn())
//                    .setIdFin(campaignVehiculeDlrAsgmt.getId_fin())
//                    .setCdeCtry(campaignVehiculeDlrAsgmt.getCde_ctry())
//                    .setCdeCmpgnTyp(campaignVehiculeDlrAsgmt.getCde_cmpgn_typ())
//                    .setCdeDlrAsgmtRule(campaignVehiculeDlrAsgmt.getCde_dlr_asgmt_rule())
//                    .setDteVehGrnd(campaignVehiculeDlrAsgmt.getDte_veh_grnd().toString())
//                    .setIndVehLnch(campaignVehiculeDlrAsgmt.getInd_veh_lnch())
//                    .setIndVehCa(campaignVehiculeDlrAsgmt.getInd_veh_ca())
//                    .setDtsCrea(campaignVehiculeDlrAsgmt.getDts_crea().toString())
//                    .setIdCreaUser(campaignVehiculeDlrAsgmt.getId_crea_user())
//                    .setDtsLastUpdt(campaignVehiculeDlrAsgmt.getDts_last_updt().toString())
//                    .setIdLastUpdtUser(campaignVehiculeDlrAsgmt.getId_last_updt_user())
//                    .setIndOper(campaignVehiculeDlrAsgmt.getInd_oper())
//                    .build();
//          sender.sendCampaignCustomer(e);
//        }
//        System.out.println("Message sent to Kafka Topic");
//    }
}
