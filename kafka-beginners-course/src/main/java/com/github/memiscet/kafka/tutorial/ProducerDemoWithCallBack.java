package com.github.memiscet.kafka.tutorial;

import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

public class ProducerDemoWithCallBack {
    public static void main(String[] args) {

        final Logger  logger = LoggerFactory.getLogger(ProducerDemoWithCallBack.class);
        String bootstrapServers = "127.0.0.1:9092";
        System.out.println("Hello World!");

        Properties properties = new Properties();
        properties.setProperty( ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,bootstrapServers );
        properties.setProperty( ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName() );
        properties.setProperty( ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,StringSerializer.class.getName() );
        //Create the producer

        KafkaProducer<String, String> producer = new KafkaProducer<String, String>( properties );
        for (int i=0;i<=10;i++){
        //create a producer record
        ProducerRecord <String, String> record =
                new ProducerRecord<String, String>( "first-topic","Hello Mello with callback "+ Integer.toString( i ) );
        //send Data -asyncronys
        producer.send( record, new Callback() {
            public void onCompletion(RecordMetadata recordMetadata, Exception e) {
                //executes everytime a record is successfully sent or an exception is thrown
                if (e ==null ){
                    //record is successfully sent
                    logger.info( "Received new metadata. \n"+
                            "Topic:"+recordMetadata.topic()+"\n"+
                            "Partition:"+recordMetadata.partition()+"\n"+
                            "Offset:"+recordMetadata.offset()+"\n"+
                            "TimeStamp:"+recordMetadata.timestamp());
                }
                else{
logger.error( "Error while producing" ,e);
                }

            }
        } );}
producer.flush();
producer.close();
    }

}
