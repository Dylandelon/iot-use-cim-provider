package cn.enncloud.iot.iotusecimprovider.rabbitmq;

import cn.enncloud.iot.iotusecimprovider.bean.MyMessage;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;

@EnableBinding(Source.class)
public class MessageProvider implements IMessageProvider {

    @Resource
    private MessageChannel output; // 消息的发送管道


    @Override
    public void send(MyMessage o) {

        boolean flag = this.output.send(MessageBuilder.withPayload(o).build()); // 创建并发送消息
        System.out.println("flag = [" + flag + "]");

    }
}
