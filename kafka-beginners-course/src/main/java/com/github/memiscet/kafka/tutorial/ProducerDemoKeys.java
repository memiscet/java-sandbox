package com.github.memiscet.kafka.tutorial;

import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

public class ProducerDemoKeys {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        final Logger  logger = LoggerFactory.getLogger( ProducerDemoKeys.class);
        String bootstrapServers = "127.0.0.1:9092";
        System.out.println("Hello World!");

        Properties properties = new Properties();
        properties.setProperty( ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,bootstrapServers );
        properties.setProperty( ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName() );
        properties.setProperty( ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,StringSerializer.class.getName() );
        //Create the producer

        KafkaProducer<String, String> producer = new KafkaProducer<String, String>( properties );
        String topic = "first-topic";

        for (int i=0;i<=10;i++){
            String value ="Hello Mello with callback "+ Integer.toString( i );
            String key = "id_"+Integer.toString( i );
        //create a producer record
        ProducerRecord <String, String> record =
                new ProducerRecord<String, String>( topic,key,value );

        logger.info( "Key:"+key ); //log the key

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
        } ).get(); //block the send to make it synchronous - don't do it in prod;
        }
producer.flush();
producer.close();
    }

}
