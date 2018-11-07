package com.example.mqcollection.rabbit.sender;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author hongwei
 * @date 2018/11/6 16:05
 */
@Component
public class DirectSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;;

    public void send1(){
        String context = "the sender is DirectSender1!";
        this.rabbitTemplate.convertAndSend("directExchange","routingKeyA",context);
    }

    public void send2(){
        String context = "the sender is DirectSender2!";
        this.rabbitTemplate.convertAndSend("directExchange","routingKeyB",context);
    }
    public void send3(){
        String context = "the sender is DirectSender3!";
        this.rabbitTemplate.convertAndSend("directExchange","routingKeyC",context);
    }
}
