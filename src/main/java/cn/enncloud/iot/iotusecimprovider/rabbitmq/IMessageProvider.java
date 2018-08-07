package cn.enncloud.iot.iotusecimprovider.rabbitmq;

import cn.enncloud.iot.iotusecimprovider.bean.MyMessage;

public interface IMessageProvider {

    void send(MyMessage o);
}
