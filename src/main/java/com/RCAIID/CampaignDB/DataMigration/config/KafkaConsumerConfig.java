package com.RCAIID.CampaignDB.DataMigration.config;


import io.confluent.kafka.serializers.KafkaAvroDeserializer;
import io.confluent.kafka.serializers.KafkaAvroDeserializerConfig;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

import java.util.HashMap;
import java.util.Map;


@EnableKafka
@Configuration
public class KafkaConsumerConfig {


    @Value("${spring.kafka.bootstrap-servers}")
    private String bootstrapServers;

    @Value("${spring.kafka.consumer.group-id}")
    private String groupId;

    @Value("${schema.registry.url}")
    private String schemaRegistryUrl;

    @Bean
    public Map<String, Object> consumerConfigs() {
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        props.put(ConsumerConfig.GROUP_ID_CONFIG, groupId);
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, KafkaAvroDeserializer.class);
        props.put(KafkaAvroDeserializerConfig.SCHEMA_REGISTRY_URL_CONFIG, schemaRegistryUrl);
        props.put(KafkaAvroDeserializerConfig.SPECIFIC_AVRO_READER_CONFIG, true);
        return props;
    }

    @Bean
    public ConsumerFactory<String, com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO> consumerFactory1() {
        return new DefaultKafkaConsumerFactory<>(consumerConfigs());
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO> kafkaListenerContainerFactory1() {
        ConcurrentKafkaListenerContainerFactory<String, com.mbusa.avro.dto.BtcServCmpgnDlrDtlDTO> factory1 = new ConcurrentKafkaListenerContainerFactory<>();
        factory1.setConsumerFactory(consumerFactory1());
        return factory1;
    }

    //

    @Bean
    public ConsumerFactory<String, com.mbusa.avro.dto.BtcServCmpgnSmryDTO> consumerFactory2() {
        return new DefaultKafkaConsumerFactory<>(consumerConfigs());
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, com.mbusa.avro.dto.BtcServCmpgnSmryDTO> kafkaListenerContainerFactory2() {
        ConcurrentKafkaListenerContainerFactory<String, com.mbusa.avro.dto.BtcServCmpgnSmryDTO> factory2 = new ConcurrentKafkaListenerContainerFactory<>();
        factory2.setConsumerFactory(consumerFactory2());
        return factory2;
    }

    //

    @Bean
    public ConsumerFactory<String, com.mbusa.avro.dto.CmpgnCtryCdeDTO> consumerFactory3() {
        return new DefaultKafkaConsumerFactory<>(consumerConfigs());
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, com.mbusa.avro.dto.CmpgnCtryCdeDTO> kafkaListenerContainerFactory3() {
        ConcurrentKafkaListenerContainerFactory<String, com.mbusa.avro.dto.CmpgnCtryCdeDTO> factory3 = new ConcurrentKafkaListenerContainerFactory<>();
        factory3.setConsumerFactory(consumerFactory3());
        return factory3;
    }

    //

    @Bean
    public ConsumerFactory<String, com.mbusa.avro.dto.CmpgnCtryVehTypDTO> consumerFactory4() {
        return new DefaultKafkaConsumerFactory<>(consumerConfigs());
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, com.mbusa.avro.dto.CmpgnCtryVehTypDTO> kafkaListenerContainerFactory4() {
        ConcurrentKafkaListenerContainerFactory<String, com.mbusa.avro.dto.CmpgnCtryVehTypDTO> factory4 = new ConcurrentKafkaListenerContainerFactory<>();
        factory4.setConsumerFactory(consumerFactory4());
        return factory4;
    }

    //

    @Bean
    public ConsumerFactory<String, com.mbusa.avro.dto.CmpgnCustDTO> consumerFactory5() {
        return new DefaultKafkaConsumerFactory<>(consumerConfigs());
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, com.mbusa.avro.dto.CmpgnCustDTO> kafkaListenerContainerFactory5() {
        ConcurrentKafkaListenerContainerFactory<String, com.mbusa.avro.dto.CmpgnCustDTO> factory5 = new ConcurrentKafkaListenerContainerFactory<>();
        factory5.setConsumerFactory(consumerFactory5());
        return factory5;
    }

    //

    @Bean
    public ConsumerFactory<String, com.mbusa.avro.dto.CmpgnCustVehDTO> consumerFactory6() {
        return new DefaultKafkaConsumerFactory<>(consumerConfigs());
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, com.mbusa.avro.dto.CmpgnCustVehDTO> kafkaListenerContainerFactory6() {
        ConcurrentKafkaListenerContainerFactory<String, com.mbusa.avro.dto.CmpgnCustVehDTO> factory6 = new ConcurrentKafkaListenerContainerFactory<>();
        factory6.setConsumerFactory(consumerFactory6());
        return factory6;
    }

    //

    @Bean
    public ConsumerFactory<String, com.mbusa.avro.dto.CmpgnDmgMstrDTO> consumerFactory7() {
        return new DefaultKafkaConsumerFactory<>(consumerConfigs());
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, com.mbusa.avro.dto.CmpgnDmgMstrDTO> kafkaListenerContainerFactory7() {
        ConcurrentKafkaListenerContainerFactory<String, com.mbusa.avro.dto.CmpgnDmgMstrDTO> factory7 = new ConcurrentKafkaListenerContainerFactory<>();
        factory7.setConsumerFactory(consumerFactory7());
        return factory7;
    }

    //

    @Bean
    public ConsumerFactory<String, com.mbusa.avro.dto.CmpgnLeglDclmTxtDTO> consumerFactory8() {
        return new DefaultKafkaConsumerFactory<>(consumerConfigs());
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, com.mbusa.avro.dto.CmpgnLeglDclmTxtDTO> kafkaListenerContainerFactory8() {
        ConcurrentKafkaListenerContainerFactory<String, com.mbusa.avro.dto.CmpgnLeglDclmTxtDTO> factory8 = new ConcurrentKafkaListenerContainerFactory<>();
        factory8.setConsumerFactory(consumerFactory8());
        return factory8;
    }

    //

    @Bean
    public ConsumerFactory<String, com.mbusa.avro.dto.CmpgnVehDTO> consumerFactory9() {
        return new DefaultKafkaConsumerFactory<>(consumerConfigs());
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String,com.mbusa.avro.dto.CmpgnVehDTO> kafkaListenerContainerFactory9() {
        ConcurrentKafkaListenerContainerFactory<String, com.mbusa.avro.dto.CmpgnVehDTO> factory9 = new ConcurrentKafkaListenerContainerFactory<>();
        factory9.setConsumerFactory(consumerFactory9());
        return factory9;
    }

    //

    @Bean
    public ConsumerFactory<String, com.mbusa.avro.dto.CmpgnVehDlrAsgmtDTO> consumerFactory10() {
        return new DefaultKafkaConsumerFactory<>(consumerConfigs());
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, com.mbusa.avro.dto.CmpgnVehDlrAsgmtDTO> kafkaListenerContainerFactory10() {
        ConcurrentKafkaListenerContainerFactory<String, com.mbusa.avro.dto.CmpgnVehDlrAsgmtDTO> factory10 = new ConcurrentKafkaListenerContainerFactory<>();
        factory10.setConsumerFactory(consumerFactory10());
        return factory10;
    }

    //

    @Bean
    public ConsumerFactory<String, com.mbusa.avro.dto.DlrAsgmtRuleCdeDTO> consumerFactory11() {
        return new DefaultKafkaConsumerFactory<>(consumerConfigs());
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, com.mbusa.avro.dto.DlrAsgmtRuleCdeDTO> kafkaListenerContainerFactory11() {
        ConcurrentKafkaListenerContainerFactory<String, com.mbusa.avro.dto.DlrAsgmtRuleCdeDTO> factory11 = new ConcurrentKafkaListenerContainerFactory<>();
        factory11.setConsumerFactory(consumerFactory11());
        return factory11;
    }

    //

    @Bean
    public ConsumerFactory<String, com.mbusa.avro.dto.TktCmpgnVehCustStatDTO> consumerFactory12() {
        return new DefaultKafkaConsumerFactory<>(consumerConfigs());
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String,com.mbusa.avro.dto.TktCmpgnVehCustStatDTO> kafkaListenerContainerFactory12() {
        ConcurrentKafkaListenerContainerFactory<String, com.mbusa.avro.dto.TktCmpgnVehCustStatDTO> factory12 = new ConcurrentKafkaListenerContainerFactory<>();
        factory12.setConsumerFactory(consumerFactory12());
        return factory12;
    }

    //

    @Bean
    public ConsumerFactory<String, com.mbusa.avro.dto.TktCmpgnVehCustStatCdeDTO> consumerFactory13() {
        return new DefaultKafkaConsumerFactory<>(consumerConfigs());
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, com.mbusa.avro.dto.TktCmpgnVehCustStatCdeDTO> kafkaListenerContainerFactory13() {
        ConcurrentKafkaListenerContainerFactory<String, com.mbusa.avro.dto.TktCmpgnVehCustStatCdeDTO> factory13 = new ConcurrentKafkaListenerContainerFactory<>();
        factory13.setConsumerFactory(consumerFactory13());
        return factory13;
    }

    //

    @Bean
    public ConsumerFactory<String, com.mbusa.avro.dto.TktReclCmpgnMstrDTO> consumerFactory14() {
        return new DefaultKafkaConsumerFactory<>(consumerConfigs());
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String,  com.mbusa.avro.dto.TktReclCmpgnMstrDTO> kafkaListenerContainerFactory14() {
        ConcurrentKafkaListenerContainerFactory<String,  com.mbusa.avro.dto.TktReclCmpgnMstrDTO> factory14 = new ConcurrentKafkaListenerContainerFactory<>();
        factory14.setConsumerFactory(consumerFactory14());
        return factory14;
    }

    //

    @Bean
    public ConsumerFactory<String, com.mbusa.avro.dto.TktVinLstDTO> consumerFactory15() {
        return new DefaultKafkaConsumerFactory<>(consumerConfigs());
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String,  com.mbusa.avro.dto.TktVinLstDTO> kafkaListenerContainerFactory15() {
        ConcurrentKafkaListenerContainerFactory<String, com.mbusa.avro.dto.TktVinLstDTO> factory15 = new ConcurrentKafkaListenerContainerFactory<>();
        factory15.setConsumerFactory(consumerFactory15());
        return factory15;
    }

    //

    @Bean
    public ConsumerFactory<String, com.mbusa.avro.dto.VehMstrDTO> consumerFactory16() {
        return new DefaultKafkaConsumerFactory<>(consumerConfigs());
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, com.mbusa.avro.dto.VehMstrDTO> kafkaListenerContainerFactory16() {
        ConcurrentKafkaListenerContainerFactory<String,com.mbusa.avro.dto.VehMstrDTO> factory16 = new ConcurrentKafkaListenerContainerFactory<>();
        factory16.setConsumerFactory(consumerFactory16());
        return factory16;
    }
}
