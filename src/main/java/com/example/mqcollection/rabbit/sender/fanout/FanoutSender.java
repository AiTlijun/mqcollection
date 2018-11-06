package com.example.mqcollection.rabbit.sender.fanout;

import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author hongwei
 * @date 2018/11/6 16:05
 */
@Component
public class FanoutSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;;

    public void send(){
        String context = "the sender is fanoutQueue!";
        this.rabbitTemplate.convertAndSend("fanoutExchange","",context);
    }
}
