package cn.enncloud.iot.iotusecimprovider.rabbitmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Component;

//@Component
//@EnableBinding(Source.class)
public class RabbitProvider {
//    @Bean
//    @InboundChannelAdapter(channel = Source.OUTPUT, poller = @Poller(fixedDelay = "100"))
//    @InboundChannelAdapter(channel = Source.OUTPUT)
//    public MessageSource<String> fooBarStrings() {
//        return () ->
//                new GenericMessage<>("");
//    }

}
