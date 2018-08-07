package cn.enncloud.iot.iotusecimprovider;

import cn.enncloud.iot.iotusecimprovider.bean.MyMessage;
import cn.enncloud.iot.iotusecimprovider.rabbitmq.IMessageProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IotUseCimProviderApplicationTests {

    @Resource
    private IMessageProvider messageProvider;

    @Test
    public void contextLoads() {
        MyMessage myMessage = new MyMessage();
        myMessage.setId(1);
        myMessage.setName("delong/test");

        messageProvider.send(myMessage);
        System.out.println("myMessage end");

    }

}
