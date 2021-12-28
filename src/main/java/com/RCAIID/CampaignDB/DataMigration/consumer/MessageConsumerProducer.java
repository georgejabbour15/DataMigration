package com.RCAIID.CampaignDB.DataMigration.consumer;


import com.RCAIID.CampaignDB.DataMigration.dto.BtcServCmpgnDlrDtl;
import com.RCAIID.CampaignDB.DataMigration.dto.BtcServCmpgnSmry;
import com.RCAIID.CampaignDB.DataMigration.dto.CmpgnCtryCde;
import com.RCAIID.CampaignDB.DataMigration.writers.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class MessageConsumerProducer {

    @Autowired
    private Sender sender1;


    @Autowired
    private DataSource dataSource;


    @KafkaListener(topics = "${kafka.topic-name-consumer1}", groupId = "${spring.kafka.consumer.group-id}")
    public void listen(@Payload com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO btcServCmpgnDlrDtlDTO, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
        System.out.println("record:" + btcServCmpgnDlrDtlDTO);
//        sendToTopic(btcServCmpgnDlrDtl);
    }

    public void sendToTopic1(BtcServCmpgnDlrDtl btcServCmpgnDlrDtl) {
        com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO e1 = com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO.newBuilder()
                .setCDECTRY(btcServCmpgnDlrDtl.getCDE_CTRY())
                .setCDEDLR(btcServCmpgnDlrDtl.getCDE_DLR())
                .setNUMCMPGN(btcServCmpgnDlrDtl.getNUM_CMPGN())
                .setDTEYR(btcServCmpgnDlrDtl.getDTE_YR())
                .setDTEMTH(btcServCmpgnDlrDtl.getDTE_MTH())
                .setDTEWK(btcServCmpgnDlrDtl.getDTE_WK())
                .setCNTTOTVEH(btcServCmpgnDlrDtl.getCNT_TOT_VEH().toString())
                .setCNTTOTRPRDVEH(btcServCmpgnDlrDtl.getCNT_TOT_RPRD_VEH())
                .setCNTTOTTARGVEH(btcServCmpgnDlrDtl.getCNT_TOT_TARG_VEH())
                .setPCTTRGTRATE(btcServCmpgnDlrDtl.getPCT_TRGT_RATE())
                .setPCTCMLRATE(btcServCmpgnDlrDtl.getPCT_CML_RATE())
                .setDTSCREA(btcServCmpgnDlrDtl.getDTS_CREA())
                .setIDCREAUSER(btcServCmpgnDlrDtl.getID_CREA_USER())
                .setDTSLASTUPDT(btcServCmpgnDlrDtl.getDTS_LAST_UPDT())
                .setIDLASTUPDTUSER(btcServCmpgnDlrDtl.getID_LAST_UPDT_USER())
                .build();
        sender1.sendBtcServCmpgnDlrDtlDTO(e1);
    }


    @KafkaListener(topics = "${kafka.topic-name-consumer2}", groupId = "${spring.kafka.consumer.group-id}")
    public void listen(@Payload com.mbusa.avro.dto.BtcServCmpgnSmryDTO btcServCmpgnSmryDTO, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
        System.out.println("record:" + btcServCmpgnSmryDTO);
//        sendToTopic(btcServCmpgnDlrDtl);
    }

    public void sendToTopic2(BtcServCmpgnSmry btcServCmpgnSmry){
        com.mbusa.avro.dto.BtcServCmpgnSmryDTO e2 = com.mbusa.avro.dto.BtcServCmpgnSmryDTO.newBuilder()
                .setCDECTRY(btcServCmpgnSmry.getCDE_CTRY())
                .setCDEDLR(btcServCmpgnSmry.getCDE_DLR())
                .setGRPHTYPECODE(btcServCmpgnSmry.getGRPH_TYPE_CODE())
                .setDTEYR(btcServCmpgnSmry.getDTE_YR())
                .setDTEMTH(btcServCmpgnSmry.getDTE_MTH())
                .setDTEWK(btcServCmpgnSmry.getDTE_WK())
                .setCNTTOTVEH(btcServCmpgnSmry.getCNT_TOT_VEH().toString())
                .setCNTTOTRPRDVEH(btcServCmpgnSmry.getCNT_TOT_RPRD_VEH())
                .setCNTTOTTARGVEH(btcServCmpgnSmry.getCNT_TOT_TARG_VEH())
                .setPCTTRGTRATE(btcServCmpgnSmry.getPCT_TRGT_RATE())
                .setPCTCMLRATE(btcServCmpgnSmry.getPCT_CML_RATE())
                .setDTSCREA(btcServCmpgnSmry.getDTS_CREA())
                .setIDCREAUSER(btcServCmpgnSmry.getID_CREA_USER())
                .setDTSLASTUPDT(btcServCmpgnSmry.getDTS_LAST_UPDT())
                .setIDLASTUPDTUSER(btcServCmpgnSmry.getID_LAST_UPDT_USER())
                .build();
        sender1.sendBtcServCmpgnDlrDtlDTO(e2);
    }


    @KafkaListener(topics = "${kafka.topic-name-consumer3}", groupId = "${spring.kafka.consumer.group-id}")
    public void listen(@Payload com.mbusa.avro.dto.CmpgnCtryCdeDTO cmpgnCtryCdeDTO, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
        System.out.println("record:" + cmpgnCtryCdeDTO);
//        sendToTopic(btcServCmpgnDlrDtl);
    }

    public void sendToTopic1(CmpgnCtryCde cmpgnCtryCde){
        com.mbusa.avro.dto.CmpgnCtryCdeDTO e3 = com.mbusa.avro.dto.CmpgnCtryCdeDTO.newBuilder()
                .setCDECTRYABRV(cmpgnCtryCde.getCDE_CTRY_ABRV())
                .setCDECTRY(cmpgnCtryCde.getCDE_CTRY())
                .setDTSCREA(cmpgnCtryCde.getDTS_CREA().toString())
                .setIDCREAUSER(cmpgnCtryCde.getID_CREA_USER())
                .setDTSLASTUPDT(cmpgnCtryCde.getDTS_LAST_UPDT().toString())
                .setIDLASTUPDTUSER(cmpgnCtryCde.getID_LAST_UPDT_USER())
                .build();
        sender1.sendBtcServCmpgnDlrDtlDTO(e3);
    }


    @KafkaListener(topics = "${kafka.topic-name-consumer}", groupId = "${spring.kafka.consumer.group-id}")
    public void listen(@Payload com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO btcServCmpgnDlrDtlDTO, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
        System.out.println("record:" + btcServCmpgnDlrDtlDTO);
        System.out.println("record1:" + btcServCmpgnDlrDtlDTO.getCDECTRY().toString());
//        sendToTopic(btcServCmpgnDlrDtl);
    }

    public void sendToTopic1(BtcServCmpgnDlrDtl btcServCmpgnDlrDtl){
        com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO e = com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO.newBuilder()
                .setCDECTRY(btcServCmpgnDlrDtl.getCDE_CTRY())
                .setCDEDLR(btcServCmpgnDlrDtl.getCDE_DLR())
                .setNUMCMPGN(btcServCmpgnDlrDtl.getNUM_CMPGN())
                .setDTEYR(btcServCmpgnDlrDtl.getDTE_YR())
                .setDTEMTH(btcServCmpgnDlrDtl.getDTE_MTH())
                .setDTEWK(btcServCmpgnDlrDtl.getDTE_WK())
                .setCNTTOTVEH(btcServCmpgnDlrDtl.getCNT_TOT_VEH().toString())
                .setCNTTOTRPRDVEH(btcServCmpgnDlrDtl.getCNT_TOT_RPRD_VEH())
                .setCNTTOTTARGVEH(btcServCmpgnDlrDtl.getCNT_TOT_TARG_VEH())
                .setPCTTRGTRATE(btcServCmpgnDlrDtl.getPCT_TRGT_RATE())
                .setPCTCMLRATE(btcServCmpgnDlrDtl.getPCT_CML_RATE())
                .setDTSCREA(btcServCmpgnDlrDtl.getDTS_CREA())
                .setIDCREAUSER(btcServCmpgnDlrDtl.getID_CREA_USER())
                .setDTSLASTUPDT(btcServCmpgnDlrDtl.getDTS_LAST_UPDT())
                .setIDLASTUPDTUSER(btcServCmpgnDlrDtl.getID_LAST_UPDT_USER())
                .build();
        sender1.sendBtcServCmpgnDlrDtlDTO(e);
    }


    @KafkaListener(topics = "${kafka.topic-name-consumer}", groupId = "${spring.kafka.consumer.group-id}")
    public void listen(@Payload com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO btcServCmpgnDlrDtlDTO, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
        System.out.println("record:" + btcServCmpgnDlrDtlDTO);
        System.out.println("record1:" + btcServCmpgnDlrDtlDTO.getCDECTRY().toString());
//        sendToTopic(btcServCmpgnDlrDtl);
    }

    public void sendToTopic1(BtcServCmpgnDlrDtl btcServCmpgnDlrDtl){
        com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO e = com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO.newBuilder()
                .setCDECTRY(btcServCmpgnDlrDtl.getCDE_CTRY())
                .setCDEDLR(btcServCmpgnDlrDtl.getCDE_DLR())
                .setNUMCMPGN(btcServCmpgnDlrDtl.getNUM_CMPGN())
                .setDTEYR(btcServCmpgnDlrDtl.getDTE_YR())
                .setDTEMTH(btcServCmpgnDlrDtl.getDTE_MTH())
                .setDTEWK(btcServCmpgnDlrDtl.getDTE_WK())
                .setCNTTOTVEH(btcServCmpgnDlrDtl.getCNT_TOT_VEH().toString())
                .setCNTTOTRPRDVEH(btcServCmpgnDlrDtl.getCNT_TOT_RPRD_VEH())
                .setCNTTOTTARGVEH(btcServCmpgnDlrDtl.getCNT_TOT_TARG_VEH())
                .setPCTTRGTRATE(btcServCmpgnDlrDtl.getPCT_TRGT_RATE())
                .setPCTCMLRATE(btcServCmpgnDlrDtl.getPCT_CML_RATE())
                .setDTSCREA(btcServCmpgnDlrDtl.getDTS_CREA())
                .setIDCREAUSER(btcServCmpgnDlrDtl.getID_CREA_USER())
                .setDTSLASTUPDT(btcServCmpgnDlrDtl.getDTS_LAST_UPDT())
                .setIDLASTUPDTUSER(btcServCmpgnDlrDtl.getID_LAST_UPDT_USER())
                .build();
        sender1.sendBtcServCmpgnDlrDtlDTO(e);
    }


    @KafkaListener(topics = "${kafka.topic-name-consumer}", groupId = "${spring.kafka.consumer.group-id}")
    public void listen(@Payload com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO btcServCmpgnDlrDtlDTO, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
        System.out.println("record:" + btcServCmpgnDlrDtlDTO);
        System.out.println("record1:" + btcServCmpgnDlrDtlDTO.getCDECTRY().toString());
//        sendToTopic(btcServCmpgnDlrDtl);
    }

    public void sendToTopic1(BtcServCmpgnDlrDtl btcServCmpgnDlrDtl){
        com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO e = com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO.newBuilder()
                .setCDECTRY(btcServCmpgnDlrDtl.getCDE_CTRY())
                .setCDEDLR(btcServCmpgnDlrDtl.getCDE_DLR())
                .setNUMCMPGN(btcServCmpgnDlrDtl.getNUM_CMPGN())
                .setDTEYR(btcServCmpgnDlrDtl.getDTE_YR())
                .setDTEMTH(btcServCmpgnDlrDtl.getDTE_MTH())
                .setDTEWK(btcServCmpgnDlrDtl.getDTE_WK())
                .setCNTTOTVEH(btcServCmpgnDlrDtl.getCNT_TOT_VEH().toString())
                .setCNTTOTRPRDVEH(btcServCmpgnDlrDtl.getCNT_TOT_RPRD_VEH())
                .setCNTTOTTARGVEH(btcServCmpgnDlrDtl.getCNT_TOT_TARG_VEH())
                .setPCTTRGTRATE(btcServCmpgnDlrDtl.getPCT_TRGT_RATE())
                .setPCTCMLRATE(btcServCmpgnDlrDtl.getPCT_CML_RATE())
                .setDTSCREA(btcServCmpgnDlrDtl.getDTS_CREA())
                .setIDCREAUSER(btcServCmpgnDlrDtl.getID_CREA_USER())
                .setDTSLASTUPDT(btcServCmpgnDlrDtl.getDTS_LAST_UPDT())
                .setIDLASTUPDTUSER(btcServCmpgnDlrDtl.getID_LAST_UPDT_USER())
                .build();
        sender1.sendBtcServCmpgnDlrDtlDTO(e);
    }


    @KafkaListener(topics = "${kafka.topic-name-consumer}", groupId = "${spring.kafka.consumer.group-id}")
    public void listen(@Payload com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO btcServCmpgnDlrDtlDTO, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
        System.out.println("record:" + btcServCmpgnDlrDtlDTO);
        System.out.println("record1:" + btcServCmpgnDlrDtlDTO.getCDECTRY().toString());
//        sendToTopic(btcServCmpgnDlrDtl);
    }

    public void sendToTopic1(BtcServCmpgnDlrDtl btcServCmpgnDlrDtl){
        com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO e = com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO.newBuilder()
                .setCDECTRY(btcServCmpgnDlrDtl.getCDE_CTRY())
                .setCDEDLR(btcServCmpgnDlrDtl.getCDE_DLR())
                .setNUMCMPGN(btcServCmpgnDlrDtl.getNUM_CMPGN())
                .setDTEYR(btcServCmpgnDlrDtl.getDTE_YR())
                .setDTEMTH(btcServCmpgnDlrDtl.getDTE_MTH())
                .setDTEWK(btcServCmpgnDlrDtl.getDTE_WK())
                .setCNTTOTVEH(btcServCmpgnDlrDtl.getCNT_TOT_VEH().toString())
                .setCNTTOTRPRDVEH(btcServCmpgnDlrDtl.getCNT_TOT_RPRD_VEH())
                .setCNTTOTTARGVEH(btcServCmpgnDlrDtl.getCNT_TOT_TARG_VEH())
                .setPCTTRGTRATE(btcServCmpgnDlrDtl.getPCT_TRGT_RATE())
                .setPCTCMLRATE(btcServCmpgnDlrDtl.getPCT_CML_RATE())
                .setDTSCREA(btcServCmpgnDlrDtl.getDTS_CREA())
                .setIDCREAUSER(btcServCmpgnDlrDtl.getID_CREA_USER())
                .setDTSLASTUPDT(btcServCmpgnDlrDtl.getDTS_LAST_UPDT())
                .setIDLASTUPDTUSER(btcServCmpgnDlrDtl.getID_LAST_UPDT_USER())
                .build();
        sender1.sendBtcServCmpgnDlrDtlDTO(e);
    }


    @KafkaListener(topics = "${kafka.topic-name-consumer}", groupId = "${spring.kafka.consumer.group-id}")
    public void listen(@Payload com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO btcServCmpgnDlrDtlDTO, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
        System.out.println("record:" + btcServCmpgnDlrDtlDTO);
        System.out.println("record1:" + btcServCmpgnDlrDtlDTO.getCDECTRY().toString());
//        sendToTopic(btcServCmpgnDlrDtl);
    }

    public void sendToTopic1(BtcServCmpgnDlrDtl btcServCmpgnDlrDtl){
        com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO e = com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO.newBuilder()
                .setCDECTRY(btcServCmpgnDlrDtl.getCDE_CTRY())
                .setCDEDLR(btcServCmpgnDlrDtl.getCDE_DLR())
                .setNUMCMPGN(btcServCmpgnDlrDtl.getNUM_CMPGN())
                .setDTEYR(btcServCmpgnDlrDtl.getDTE_YR())
                .setDTEMTH(btcServCmpgnDlrDtl.getDTE_MTH())
                .setDTEWK(btcServCmpgnDlrDtl.getDTE_WK())
                .setCNTTOTVEH(btcServCmpgnDlrDtl.getCNT_TOT_VEH().toString())
                .setCNTTOTRPRDVEH(btcServCmpgnDlrDtl.getCNT_TOT_RPRD_VEH())
                .setCNTTOTTARGVEH(btcServCmpgnDlrDtl.getCNT_TOT_TARG_VEH())
                .setPCTTRGTRATE(btcServCmpgnDlrDtl.getPCT_TRGT_RATE())
                .setPCTCMLRATE(btcServCmpgnDlrDtl.getPCT_CML_RATE())
                .setDTSCREA(btcServCmpgnDlrDtl.getDTS_CREA())
                .setIDCREAUSER(btcServCmpgnDlrDtl.getID_CREA_USER())
                .setDTSLASTUPDT(btcServCmpgnDlrDtl.getDTS_LAST_UPDT())
                .setIDLASTUPDTUSER(btcServCmpgnDlrDtl.getID_LAST_UPDT_USER())
                .build();
        sender1.sendBtcServCmpgnDlrDtlDTO(e);
    }


    @KafkaListener(topics = "${kafka.topic-name-consumer}", groupId = "${spring.kafka.consumer.group-id}")
    public void listen(@Payload com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO btcServCmpgnDlrDtlDTO, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
        System.out.println("record:" + btcServCmpgnDlrDtlDTO);
        System.out.println("record1:" + btcServCmpgnDlrDtlDTO.getCDECTRY().toString());
//        sendToTopic(btcServCmpgnDlrDtl);
    }

    public void sendToTopic1(BtcServCmpgnDlrDtl btcServCmpgnDlrDtl){
        com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO e = com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO.newBuilder()
                .setCDECTRY(btcServCmpgnDlrDtl.getCDE_CTRY())
                .setCDEDLR(btcServCmpgnDlrDtl.getCDE_DLR())
                .setNUMCMPGN(btcServCmpgnDlrDtl.getNUM_CMPGN())
                .setDTEYR(btcServCmpgnDlrDtl.getDTE_YR())
                .setDTEMTH(btcServCmpgnDlrDtl.getDTE_MTH())
                .setDTEWK(btcServCmpgnDlrDtl.getDTE_WK())
                .setCNTTOTVEH(btcServCmpgnDlrDtl.getCNT_TOT_VEH().toString())
                .setCNTTOTRPRDVEH(btcServCmpgnDlrDtl.getCNT_TOT_RPRD_VEH())
                .setCNTTOTTARGVEH(btcServCmpgnDlrDtl.getCNT_TOT_TARG_VEH())
                .setPCTTRGTRATE(btcServCmpgnDlrDtl.getPCT_TRGT_RATE())
                .setPCTCMLRATE(btcServCmpgnDlrDtl.getPCT_CML_RATE())
                .setDTSCREA(btcServCmpgnDlrDtl.getDTS_CREA())
                .setIDCREAUSER(btcServCmpgnDlrDtl.getID_CREA_USER())
                .setDTSLASTUPDT(btcServCmpgnDlrDtl.getDTS_LAST_UPDT())
                .setIDLASTUPDTUSER(btcServCmpgnDlrDtl.getID_LAST_UPDT_USER())
                .build();
        sender1.sendBtcServCmpgnDlrDtlDTO(e);
    }


    @KafkaListener(topics = "${kafka.topic-name-consumer}", groupId = "${spring.kafka.consumer.group-id}")
    public void listen(@Payload com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO btcServCmpgnDlrDtlDTO, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
        System.out.println("record:" + btcServCmpgnDlrDtlDTO);
        System.out.println("record1:" + btcServCmpgnDlrDtlDTO.getCDECTRY().toString());
//        sendToTopic(btcServCmpgnDlrDtl);
    }

    public void sendToTopic1(BtcServCmpgnDlrDtl btcServCmpgnDlrDtl){
        com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO e = com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO.newBuilder()
                .setCDECTRY(btcServCmpgnDlrDtl.getCDE_CTRY())
                .setCDEDLR(btcServCmpgnDlrDtl.getCDE_DLR())
                .setNUMCMPGN(btcServCmpgnDlrDtl.getNUM_CMPGN())
                .setDTEYR(btcServCmpgnDlrDtl.getDTE_YR())
                .setDTEMTH(btcServCmpgnDlrDtl.getDTE_MTH())
                .setDTEWK(btcServCmpgnDlrDtl.getDTE_WK())
                .setCNTTOTVEH(btcServCmpgnDlrDtl.getCNT_TOT_VEH().toString())
                .setCNTTOTRPRDVEH(btcServCmpgnDlrDtl.getCNT_TOT_RPRD_VEH())
                .setCNTTOTTARGVEH(btcServCmpgnDlrDtl.getCNT_TOT_TARG_VEH())
                .setPCTTRGTRATE(btcServCmpgnDlrDtl.getPCT_TRGT_RATE())
                .setPCTCMLRATE(btcServCmpgnDlrDtl.getPCT_CML_RATE())
                .setDTSCREA(btcServCmpgnDlrDtl.getDTS_CREA())
                .setIDCREAUSER(btcServCmpgnDlrDtl.getID_CREA_USER())
                .setDTSLASTUPDT(btcServCmpgnDlrDtl.getDTS_LAST_UPDT())
                .setIDLASTUPDTUSER(btcServCmpgnDlrDtl.getID_LAST_UPDT_USER())
                .build();
        sender1.sendBtcServCmpgnDlrDtlDTO(e);
    }


    @KafkaListener(topics = "${kafka.topic-name-consumer}", groupId = "${spring.kafka.consumer.group-id}")
    public void listen(@Payload com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO btcServCmpgnDlrDtlDTO, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
        System.out.println("record:" + btcServCmpgnDlrDtlDTO);
        System.out.println("record1:" + btcServCmpgnDlrDtlDTO.getCDECTRY().toString());
//        sendToTopic(btcServCmpgnDlrDtl);
    }

    public void sendToTopic1(BtcServCmpgnDlrDtl btcServCmpgnDlrDtl){
        com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO e = com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO.newBuilder()
                .setCDECTRY(btcServCmpgnDlrDtl.getCDE_CTRY())
                .setCDEDLR(btcServCmpgnDlrDtl.getCDE_DLR())
                .setNUMCMPGN(btcServCmpgnDlrDtl.getNUM_CMPGN())
                .setDTEYR(btcServCmpgnDlrDtl.getDTE_YR())
                .setDTEMTH(btcServCmpgnDlrDtl.getDTE_MTH())
                .setDTEWK(btcServCmpgnDlrDtl.getDTE_WK())
                .setCNTTOTVEH(btcServCmpgnDlrDtl.getCNT_TOT_VEH().toString())
                .setCNTTOTRPRDVEH(btcServCmpgnDlrDtl.getCNT_TOT_RPRD_VEH())
                .setCNTTOTTARGVEH(btcServCmpgnDlrDtl.getCNT_TOT_TARG_VEH())
                .setPCTTRGTRATE(btcServCmpgnDlrDtl.getPCT_TRGT_RATE())
                .setPCTCMLRATE(btcServCmpgnDlrDtl.getPCT_CML_RATE())
                .setDTSCREA(btcServCmpgnDlrDtl.getDTS_CREA())
                .setIDCREAUSER(btcServCmpgnDlrDtl.getID_CREA_USER())
                .setDTSLASTUPDT(btcServCmpgnDlrDtl.getDTS_LAST_UPDT())
                .setIDLASTUPDTUSER(btcServCmpgnDlrDtl.getID_LAST_UPDT_USER())
                .build();
        sender1.sendBtcServCmpgnDlrDtlDTO(e);
    }


    @KafkaListener(topics = "${kafka.topic-name-consumer}", groupId = "${spring.kafka.consumer.group-id}")
    public void listen(@Payload com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO btcServCmpgnDlrDtlDTO, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
        System.out.println("record:" + btcServCmpgnDlrDtlDTO);
        System.out.println("record1:" + btcServCmpgnDlrDtlDTO.getCDECTRY().toString());
//        sendToTopic(btcServCmpgnDlrDtl);
    }

    public void sendToTopic1(BtcServCmpgnDlrDtl btcServCmpgnDlrDtl){
        com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO e = com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO.newBuilder()
                .setCDECTRY(btcServCmpgnDlrDtl.getCDE_CTRY())
                .setCDEDLR(btcServCmpgnDlrDtl.getCDE_DLR())
                .setNUMCMPGN(btcServCmpgnDlrDtl.getNUM_CMPGN())
                .setDTEYR(btcServCmpgnDlrDtl.getDTE_YR())
                .setDTEMTH(btcServCmpgnDlrDtl.getDTE_MTH())
                .setDTEWK(btcServCmpgnDlrDtl.getDTE_WK())
                .setCNTTOTVEH(btcServCmpgnDlrDtl.getCNT_TOT_VEH().toString())
                .setCNTTOTRPRDVEH(btcServCmpgnDlrDtl.getCNT_TOT_RPRD_VEH())
                .setCNTTOTTARGVEH(btcServCmpgnDlrDtl.getCNT_TOT_TARG_VEH())
                .setPCTTRGTRATE(btcServCmpgnDlrDtl.getPCT_TRGT_RATE())
                .setPCTCMLRATE(btcServCmpgnDlrDtl.getPCT_CML_RATE())
                .setDTSCREA(btcServCmpgnDlrDtl.getDTS_CREA())
                .setIDCREAUSER(btcServCmpgnDlrDtl.getID_CREA_USER())
                .setDTSLASTUPDT(btcServCmpgnDlrDtl.getDTS_LAST_UPDT())
                .setIDLASTUPDTUSER(btcServCmpgnDlrDtl.getID_LAST_UPDT_USER())
                .build();
        sender1.sendBtcServCmpgnDlrDtlDTO(e);
    }


    @KafkaListener(topics = "${kafka.topic-name-consumer}", groupId = "${spring.kafka.consumer.group-id}")
    public void listen(@Payload com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO btcServCmpgnDlrDtlDTO, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
        System.out.println("record:" + btcServCmpgnDlrDtlDTO);
        System.out.println("record1:" + btcServCmpgnDlrDtlDTO.getCDECTRY().toString());
//        sendToTopic(btcServCmpgnDlrDtl);
    }

    public void sendToTopic1(BtcServCmpgnDlrDtl btcServCmpgnDlrDtl){
        com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO e = com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO.newBuilder()
                .setCDECTRY(btcServCmpgnDlrDtl.getCDE_CTRY())
                .setCDEDLR(btcServCmpgnDlrDtl.getCDE_DLR())
                .setNUMCMPGN(btcServCmpgnDlrDtl.getNUM_CMPGN())
                .setDTEYR(btcServCmpgnDlrDtl.getDTE_YR())
                .setDTEMTH(btcServCmpgnDlrDtl.getDTE_MTH())
                .setDTEWK(btcServCmpgnDlrDtl.getDTE_WK())
                .setCNTTOTVEH(btcServCmpgnDlrDtl.getCNT_TOT_VEH().toString())
                .setCNTTOTRPRDVEH(btcServCmpgnDlrDtl.getCNT_TOT_RPRD_VEH())
                .setCNTTOTTARGVEH(btcServCmpgnDlrDtl.getCNT_TOT_TARG_VEH())
                .setPCTTRGTRATE(btcServCmpgnDlrDtl.getPCT_TRGT_RATE())
                .setPCTCMLRATE(btcServCmpgnDlrDtl.getPCT_CML_RATE())
                .setDTSCREA(btcServCmpgnDlrDtl.getDTS_CREA())
                .setIDCREAUSER(btcServCmpgnDlrDtl.getID_CREA_USER())
                .setDTSLASTUPDT(btcServCmpgnDlrDtl.getDTS_LAST_UPDT())
                .setIDLASTUPDTUSER(btcServCmpgnDlrDtl.getID_LAST_UPDT_USER())
                .build();
        sender1.sendBtcServCmpgnDlrDtlDTO(e);
    }


    @KafkaListener(topics = "${kafka.topic-name-consumer}", groupId = "${spring.kafka.consumer.group-id}")
    public void listen(@Payload com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO btcServCmpgnDlrDtlDTO, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
        System.out.println("record:" + btcServCmpgnDlrDtlDTO);
        System.out.println("record1:" + btcServCmpgnDlrDtlDTO.getCDECTRY().toString());
//        sendToTopic(btcServCmpgnDlrDtl);
    }

    public void sendToTopic1(BtcServCmpgnDlrDtl btcServCmpgnDlrDtl){
        com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO e = com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO.newBuilder()
                .setCDECTRY(btcServCmpgnDlrDtl.getCDE_CTRY())
                .setCDEDLR(btcServCmpgnDlrDtl.getCDE_DLR())
                .setNUMCMPGN(btcServCmpgnDlrDtl.getNUM_CMPGN())
                .setDTEYR(btcServCmpgnDlrDtl.getDTE_YR())
                .setDTEMTH(btcServCmpgnDlrDtl.getDTE_MTH())
                .setDTEWK(btcServCmpgnDlrDtl.getDTE_WK())
                .setCNTTOTVEH(btcServCmpgnDlrDtl.getCNT_TOT_VEH().toString())
                .setCNTTOTRPRDVEH(btcServCmpgnDlrDtl.getCNT_TOT_RPRD_VEH())
                .setCNTTOTTARGVEH(btcServCmpgnDlrDtl.getCNT_TOT_TARG_VEH())
                .setPCTTRGTRATE(btcServCmpgnDlrDtl.getPCT_TRGT_RATE())
                .setPCTCMLRATE(btcServCmpgnDlrDtl.getPCT_CML_RATE())
                .setDTSCREA(btcServCmpgnDlrDtl.getDTS_CREA())
                .setIDCREAUSER(btcServCmpgnDlrDtl.getID_CREA_USER())
                .setDTSLASTUPDT(btcServCmpgnDlrDtl.getDTS_LAST_UPDT())
                .setIDLASTUPDTUSER(btcServCmpgnDlrDtl.getID_LAST_UPDT_USER())
                .build();
        sender1.sendBtcServCmpgnDlrDtlDTO(e);
    }


    @KafkaListener(topics = "${kafka.topic-name-consumer}", groupId = "${spring.kafka.consumer.group-id}")
    public void listen(@Payload com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO btcServCmpgnDlrDtlDTO, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
        System.out.println("record:" + btcServCmpgnDlrDtlDTO);
        System.out.println("record1:" + btcServCmpgnDlrDtlDTO.getCDECTRY().toString());
//        sendToTopic(btcServCmpgnDlrDtl);
    }

    public void sendToTopic1(BtcServCmpgnDlrDtl btcServCmpgnDlrDtl){
        com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO e = com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO.newBuilder()
                .setCDECTRY(btcServCmpgnDlrDtl.getCDE_CTRY())
                .setCDEDLR(btcServCmpgnDlrDtl.getCDE_DLR())
                .setNUMCMPGN(btcServCmpgnDlrDtl.getNUM_CMPGN())
                .setDTEYR(btcServCmpgnDlrDtl.getDTE_YR())
                .setDTEMTH(btcServCmpgnDlrDtl.getDTE_MTH())
                .setDTEWK(btcServCmpgnDlrDtl.getDTE_WK())
                .setCNTTOTVEH(btcServCmpgnDlrDtl.getCNT_TOT_VEH().toString())
                .setCNTTOTRPRDVEH(btcServCmpgnDlrDtl.getCNT_TOT_RPRD_VEH())
                .setCNTTOTTARGVEH(btcServCmpgnDlrDtl.getCNT_TOT_TARG_VEH())
                .setPCTTRGTRATE(btcServCmpgnDlrDtl.getPCT_TRGT_RATE())
                .setPCTCMLRATE(btcServCmpgnDlrDtl.getPCT_CML_RATE())
                .setDTSCREA(btcServCmpgnDlrDtl.getDTS_CREA())
                .setIDCREAUSER(btcServCmpgnDlrDtl.getID_CREA_USER())
                .setDTSLASTUPDT(btcServCmpgnDlrDtl.getDTS_LAST_UPDT())
                .setIDLASTUPDTUSER(btcServCmpgnDlrDtl.getID_LAST_UPDT_USER())
                .build();
        sender1.sendBtcServCmpgnDlrDtlDTO(e);
    }


    @KafkaListener(topics = "${kafka.topic-name-consumer}", groupId = "${spring.kafka.consumer.group-id}")
    public void listen(@Payload com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO btcServCmpgnDlrDtlDTO, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
        System.out.println("record:" + btcServCmpgnDlrDtlDTO);
        System.out.println("record1:" + btcServCmpgnDlrDtlDTO.getCDECTRY().toString());
//        sendToTopic(btcServCmpgnDlrDtl);
    }

    public void sendToTopic1(BtcServCmpgnDlrDtl btcServCmpgnDlrDtl){
        com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO e = com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO.newBuilder()
                .setCDECTRY(btcServCmpgnDlrDtl.getCDE_CTRY())
                .setCDEDLR(btcServCmpgnDlrDtl.getCDE_DLR())
                .setNUMCMPGN(btcServCmpgnDlrDtl.getNUM_CMPGN())
                .setDTEYR(btcServCmpgnDlrDtl.getDTE_YR())
                .setDTEMTH(btcServCmpgnDlrDtl.getDTE_MTH())
                .setDTEWK(btcServCmpgnDlrDtl.getDTE_WK())
                .setCNTTOTVEH(btcServCmpgnDlrDtl.getCNT_TOT_VEH().toString())
                .setCNTTOTRPRDVEH(btcServCmpgnDlrDtl.getCNT_TOT_RPRD_VEH())
                .setCNTTOTTARGVEH(btcServCmpgnDlrDtl.getCNT_TOT_TARG_VEH())
                .setPCTTRGTRATE(btcServCmpgnDlrDtl.getPCT_TRGT_RATE())
                .setPCTCMLRATE(btcServCmpgnDlrDtl.getPCT_CML_RATE())
                .setDTSCREA(btcServCmpgnDlrDtl.getDTS_CREA())
                .setIDCREAUSER(btcServCmpgnDlrDtl.getID_CREA_USER())
                .setDTSLASTUPDT(btcServCmpgnDlrDtl.getDTS_LAST_UPDT())
                .setIDLASTUPDTUSER(btcServCmpgnDlrDtl.getID_LAST_UPDT_USER())
                .build();
        sender1.sendBtcServCmpgnDlrDtlDTO(e);
    }


}