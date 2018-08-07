package cn.enncloud.iot.iotusecimprovider.controller;

import cn.enncloud.iot.iotusecimprovider.bean.MyMessage;
import cn.enncloud.iot.iotusecimprovider.rabbitmq.FooBarSource;
import cn.enncloud.iot.iotusecimprovider.rabbitmq.IMessageProvider;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MsgSendController {
    @Resource
    private IMessageProvider messageProvider;

    private static final Logger logger = LogManager.getLogger(MsgSendController.class);

    @Autowired
    private FooBarSource fooBarSource;

    @RequestMapping("send")
    public void sendMeaage(){

        logger.info("MsgSendController start");
        MyMessage myMessage = new MyMessage();
        myMessage.setId(1);
        myMessage.setName("delong/test");
        messageProvider.send(myMessage);


    }
    @RequestMapping("outSend")
    public void outSendMeaage(){

        fooBarSource.fooBarStrings();


    }
}
