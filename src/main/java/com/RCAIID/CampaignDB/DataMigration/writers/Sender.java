package com.RCAIID.CampaignDB.DataMigration.writers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Sender {


    @Value("${kafka.topic-name-table1}")
    private String topic1;

    @Value("${kafka.topic-name-table2}")
    private String topic2;

    @Value("${kafka.topic-name-table3}")
    private String topic3;

    @Value("${kafka.topic-name-table4}")
    private String topic4;

    @Value("${kafka.topic-name-table5}")
    private String topic5;

    @Value("${kafka.topic-name-table6}")
    private String topic6;

    @Value("${kafka.topic-name-table7}")
    private String topic7;

    @Value("${kafka.topic-name-table8}")
    private String topic8;

    @Value("${kafka.topic-name-table9}")
    private String topic9;

    @Value("${kafka.topic-name-table10}")
    private String topic10;

    @Value("${kafka.topic-name-table11}")
    private String topic11;

    @Value("${kafka.topic-name-table12}")
    private String topic12;

    @Value("${kafka.topic-name-table13}")
    private String topic13;

    @Value("${kafka.topic-name-table14}")
    private String topic14;

    @Value("${kafka.topic-name-table15}")
    private String topic15;

    @Value("${kafka.topic-name-table16}")
    private String topic16;

    @Autowired
    private KafkaTemplate<String, com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO> kafkaTemplate1;

    public void sendBtcServCmpgnDlrDtlDTO(com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO btcServCmpgnDlrDtlDTO) {
        kafkaTemplate1.send(topic1, btcServCmpgnDlrDtlDTO);
    }

    //
    @Autowired
    private KafkaTemplate<String, com.mbusa.avro.dto.BtcServCmpgnSmryDTO> kafkaTemplate2;

    public void sendBtcServCmognSmryDTO(com.mbusa.avro.dto.BtcServCmpgnSmryDTO btcServCmognSmryDTO) {
        kafkaTemplate2.send(topic2, btcServCmognSmryDTO);
    }

    //
    @Autowired
    private KafkaTemplate<String, com.mbusa.avro.dto.CmpgnCtryCdeDTO> kafkaTemplate3;

    public void snedCmpgnCtryCdeDTO(com.mbusa.avro.dto.CmpgnCtryCdeDTO cmpgnCtryCdeDTO) {
        kafkaTemplate3.send(topic3, cmpgnCtryCdeDTO);
    }

    @Autowired
    private KafkaTemplate<String, com.mbusa.avro.dto.CmpgnCtryVehTypDTO> kafkaTemplate4;

    public void sendCmpgnCtryVehTypDTO(com.mbusa.avro.dto.CmpgnCtryVehTypDTO cmpgnCtryVehTypDTO) {
        kafkaTemplate4.send(topic4, cmpgnCtryVehTypDTO);
    }

    @Autowired
    private KafkaTemplate<String, com.mbusa.avro.dto.CmpgnCustDTO> kafkaTemplate5;

    public void sendCmpgnCustDTO(com.mbusa.avro.dto.CmpgnCustDTO cmpgnCustDTO) {
        kafkaTemplate5.send(topic5, cmpgnCustDTO);
    }

    @Autowired
    private KafkaTemplate<String, com.mbusa.avro.dto.CmpgnCustVehDTO> kafkaTemplate6;

    public void sendCmpgnCustVehDTO(com.mbusa.avro.dto.CmpgnCustVehDTO cmpgnCustVehDTO) {
        kafkaTemplate6.send(topic6, cmpgnCustVehDTO);
    }

    @Autowired
    private KafkaTemplate<String, com.mbusa.avro.dto.CmpgnDmgMstrDTO> kafkaTemplate7;

    public void sendCmpgnDmgMstrDTO(com.mbusa.avro.dto.CmpgnDmgMstrDTO cmpgnDmgMstrDTO) {
        kafkaTemplate7.send(topic7, cmpgnDmgMstrDTO);
    }

    @Autowired
    private KafkaTemplate<String, com.mbusa.avro.dto.CmpgnLeglDclmTxtDTO> kafkaTemplate8;

    public void sendCmpgnLeglDclmTxtDTO(com.mbusa.avro.dto.CmpgnLeglDclmTxtDTO cmpgnLeglDclmTxtDTO) {
        kafkaTemplate8.send(topic8, cmpgnLeglDclmTxtDTO);
    }

    @Autowired
    private KafkaTemplate<String, com.mbusa.avro.dto.CmpgnVehDTO> kafkaTemplate9;

    public void sendCmpgnVehDTO(com.mbusa.avro.dto.CmpgnVehDTO cmpgnVehDTO) {
        kafkaTemplate9.send(topic9, cmpgnVehDTO);
    }

    @Autowired
    private KafkaTemplate<String, com.mbusa.avro.dto.CmpgnVehDlrAsgmtDTO> kafkaTemplate10;

    public void sendCmpgnVehDlrAsgmtDTO(com.mbusa.avro.dto.CmpgnVehDlrAsgmtDTO cmpgnVehDlrAsgmtDTO) {
        kafkaTemplate10.send(topic10, cmpgnVehDlrAsgmtDTO);
    }

    @Autowired
    private KafkaTemplate<String, com.mbusa.avro.dto.DlrAsgmtRuleCdeDTO> kafkaTemplate11;

    public void sendDlrAsgmtRuleCdeDTO(com.mbusa.avro.dto.DlrAsgmtRuleCdeDTO dlrAsgmtRuleCdeDTO) {
        kafkaTemplate11.send(topic11, dlrAsgmtRuleCdeDTO);
    }

    @Autowired
    private KafkaTemplate<String, com.mbusa.avro.dto.TktCmpgnVehCustStatDTO> kafkaTemplate12;

    public void sendTktCmpgnVehCustStatCdeDTO(com.mbusa.avro.dto.TktCmpgnVehCustStatDTO tktCmpgnVehCustStatDTO) {
        kafkaTemplate12.send(topic12, tktCmpgnVehCustStatDTO);
    }

    //
    @Autowired
    private KafkaTemplate<String, com.mbusa.avro.dto.TktCmpgnVehCustStatCdeDTO> kafkaTemplate13;

    public void sendTktCmpgnVehCustStatCdeDTO(com.mbusa.avro.dto.TktCmpgnVehCustStatCdeDTO tktCmpgnVehCustStatCdeDTO) {
        kafkaTemplate13.send(topic13, tktCmpgnVehCustStatCdeDTO);
    }


    //
    @Autowired
    private KafkaTemplate<String, com.mbusa.avro.dto.TktReclCmpgnMstrDTO> kafkaTemplate14;

    public void sendTktReclCmpgnMstrDTO(com.mbusa.avro.dto.TktReclCmpgnMstrDTO tktReclCmpgnMstrDTO) {
        kafkaTemplate14.send(topic14, tktReclCmpgnMstrDTO);
    }


    //
    @Autowired
    private KafkaTemplate<String, com.mbusa.avro.dto.TktVinLstDTO> kafkaTemplate15;

    public void sendTktVinLstDTO(com.mbusa.avro.dto.TktVinLstDTO tktVinLstDTO) {
        kafkaTemplate15.send(topic15, tktVinLstDTO);
    }


    //
    @Autowired
    private KafkaTemplate<String, com.mbusa.avro.dto.VehMstrDTO> kafkaTemplate16;

    public void sendVehMstrDTO(com.mbusa.avro.dto.VehMstrDTO vehMstrDTO) {
        kafkaTemplate16.send(topic16, vehMstrDTO);
    }
}
