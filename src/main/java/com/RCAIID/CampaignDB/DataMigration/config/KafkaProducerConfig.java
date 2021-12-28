package com.RCAIID.CampaignDB.DataMigration.config;

import io.confluent.kafka.serializers.KafkaAvroSerializer;
import io.confluent.kafka.serializers.KafkaAvroSerializerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableKafka
public class KafkaProducerConfig {


    @Value("${spring.kafka.bootstrap-servers}")
    private String bootstrapServers;

    @Value("${schema.registry.url}")
    private String schemaRegistryUrl;

    @Value("${spring.kafka.consumer.group-id}")
    private String groupId;

    @Bean
    public Map<String, Object> producerConfigs() {
        Map<String, Object> props = new HashMap<>();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class);
        props.put(KafkaAvroSerializerConfig.SCHEMA_REGISTRY_URL_CONFIG, schemaRegistryUrl);
        return props;
    }
//
    @Bean
    public ProducerFactory<String, com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO> producerFactory1() {
        return new DefaultKafkaProducerFactory<>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String, com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO> kafkaTemplate1() {
        return new KafkaTemplate<>(producerFactory1());
    }

  //
    @Bean
    public ProducerFactory<String, com.mbusa.avro.dto.BtcServCmpgnSmryDTO> producerFactory2() {
        return new DefaultKafkaProducerFactory<>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String, com.mbusa.avro.dto.BtcServCmpgnSmryDTO> kafkaTemplate2() {
        return new KafkaTemplate<>(producerFactory2());
    }

    //
    @Bean
    public ProducerFactory<String, com.mbusa.avro.dto.CmpgnVehDlrAsgmtDTO> producerFactory3() {
        return new DefaultKafkaProducerFactory<>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String, com.mbusa.avro.dto.CmpgnVehDlrAsgmtDTO> kafkaTemplate3() {
        return new KafkaTemplate<>(producerFactory3());
    }

    //
    @Bean
    public ProducerFactory<String, com.mbusa.avro.dto.CmpgnCtryCdeDTO> producerFactory4() {
        return new DefaultKafkaProducerFactory<>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String, com.mbusa.avro.dto.CmpgnCtryCdeDTO> kafkaTemplate4() {
        return new KafkaTemplate<>(producerFactory4());
    }

    //
    @Bean
    public ProducerFactory<String, com.mbusa.avro.dto.CmpgnCtryVehTypDTO> producerFactory5() {
        return new DefaultKafkaProducerFactory<>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String, com.mbusa.avro.dto.CmpgnCtryVehTypDTO> kafkaTemplate5() {
        return new KafkaTemplate<>(producerFactory5());
    }

    //
    @Bean
    public ProducerFactory<String, com.mbusa.avro.dto.CmpgnCustDTO> producerFactory6() {
        return new DefaultKafkaProducerFactory<>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String,  com.mbusa.avro.dto.CmpgnCustDTO> kafkaTemplate6() {
        return new KafkaTemplate<>(producerFactory6());
    }

    //
    @Bean
    public ProducerFactory<String, com.mbusa.avro.dto.CmpgnCustVehDTO> producerFactory7() {
        return new DefaultKafkaProducerFactory<>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String, com.mbusa.avro.dto.CmpgnCustVehDTO> kafkaTemplate7() {
        return new KafkaTemplate<>(producerFactory7());
    }

    //
    @Bean
    public ProducerFactory<String, com.mbusa.avro.dto.CmpgnDmgMstrDTO> producerFactory8() {
        return new DefaultKafkaProducerFactory<>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String, com.mbusa.avro.dto.CmpgnDmgMstrDTO> kafkaTemplate8() {
        return new KafkaTemplate<>(producerFactory8());
    }

    //
    @Bean
    public ProducerFactory<String, com.mbusa.avro.dto.CmpgnLeglDclmTxtDTO> producerFactory9() {
        return new DefaultKafkaProducerFactory<>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String, com.mbusa.avro.dto.CmpgnLeglDclmTxtDTO> kafkaTemplate9() {
        return new KafkaTemplate<>(producerFactory9());
    }

    //
    @Bean
    public ProducerFactory<String, com.mbusa.avro.dto.CmpgnVehDTO> producerFactory10() {
        return new DefaultKafkaProducerFactory<>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String, com.mbusa.avro.dto.CmpgnVehDTO> kafkaTemplate10() {
        return new KafkaTemplate<>(producerFactory10());
    }

    //
    @Bean
    public ProducerFactory<String, com.mbusa.avro.dto.DlrAsgmtRuleCdeDTO> producerFactory11() {
        return new DefaultKafkaProducerFactory<>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String, com.mbusa.avro.dto.DlrAsgmtRuleCdeDTO> kafkaTemplate11() {
        return new KafkaTemplate<>(producerFactory11());
    }

    //
    @Bean
    public ProducerFactory<String, com.mbusa.avro.dto.TktCmpgnVehCustStatDTO> producerFactory12() {
        return new DefaultKafkaProducerFactory<>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String, com.mbusa.avro.dto.TktCmpgnVehCustStatDTO> kafkaTemplate12() {
        return new KafkaTemplate<>(producerFactory12());
    }

    //
    @Bean
    public ProducerFactory<String, com.mbusa.avro.dto.TktCmpgnVehCustStatCdeDTO> producerFactory13() {
        return new DefaultKafkaProducerFactory<>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String, com.mbusa.avro.dto.TktCmpgnVehCustStatCdeDTO> kafkaTemplate13() {
        return new KafkaTemplate<>(producerFactory13());
    }

    //
    @Bean
    public ProducerFactory<String, com.mbusa.avro.dto.TktReclCmpgnMstrDTO> producerFactory14() {
        return new DefaultKafkaProducerFactory<>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String, com.mbusa.avro.dto.TktReclCmpgnMstrDTO> kafkaTemplate14() {
        return new KafkaTemplate<>(producerFactory14());
    }

    //
    @Bean
    public ProducerFactory<String, com.mbusa.avro.dto.TktVinLstDTO> producerFactory15() {
        return new DefaultKafkaProducerFactory<>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String, com.mbusa.avro.dto.TktVinLstDTO> kafkaTemplate15() {
        return new KafkaTemplate<>(producerFactory15());
    }

    //
    @Bean
    public ProducerFactory<String, com.mbusa.avro.dto.VehMstrDTO> producerFactory16() {
        return new DefaultKafkaProducerFactory<>(producerConfigs());
    }

    @Bean
    public KafkaTemplate<String, com.mbusa.avro.dto.VehMstrDTO> kafkaTemplate16() {
        return new KafkaTemplate<>(producerFactory16());
    }
}
