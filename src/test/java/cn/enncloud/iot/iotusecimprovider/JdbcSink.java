package cn.enncloud.iot.iotusecimprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.MessageHandler;

import javax.sql.DataSource;

@SpringBootApplication
@EnableBinding(Sink.class)
public class JdbcSink {

//    @Bean
//    @ServiceActivator(inputChannel = Sink.INPUT)
//    public MessageHandler jdbcHandler(DataSource dataSource) {
//        return new JdbcMessageHandler(dataSource, "INSERT INTO foobar (value) VALUES (:payload)");
//    }
//
//    public static void main(String[] args) {
//        SpringApplication.run(JdbcSink.class, args);
//    }

}
