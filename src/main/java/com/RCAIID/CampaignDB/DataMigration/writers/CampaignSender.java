package com.RCAIID.CampaignDB.DataMigration.writers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CampaignSender {


    @Value("${kafka.topic-name-producer}")
    private String topic;

//    @Autowired
//    private KafkaTemplate<String, com.mbusa.avro.dto.CampaignVehiculeDealerAsgmtDTO> kafkaTemplateCampaign;
//
//    public void sendCampaignCustomer(com.mbusa.avro.dto.CampaignVehiculeDealerAsgmtDTO CampaignVehiculeDlrAsgmt) {
//        kafkaTemplateCampaign.send(topic, CampaignVehiculeDlrAsgmt);
//    }
}
