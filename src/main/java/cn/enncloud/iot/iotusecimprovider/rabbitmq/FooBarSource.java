package cn.enncloud.iot.iotusecimprovider.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.GenericMessage;

import java.util.concurrent.atomic.AtomicBoolean;

@EnableBinding(Source.class)
public class FooBarSource {

    private AtomicBoolean semaphore = new AtomicBoolean(true);

//    @Autowired
//    @Output(MqMessageSource.MESSAGE_OUTPUT)
//    private MessageChannel channel;

    @Bean
    @InboundChannelAdapter(channel = Source.OUTPUT, poller = @Poller(fixedDelay = "100"))
    public MessageSource<String> fooBarStrings() {
        return () ->
                new GenericMessage<>(this.semaphore.getAndSet(!this.semaphore.get()) ? "foo" : "bar");
    }

    public static void main(String[] args) {
        SpringApplication.run(FooBarSource.class, args);
    }

}
