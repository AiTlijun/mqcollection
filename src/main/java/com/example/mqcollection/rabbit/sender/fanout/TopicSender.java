package com.example.mqcollection.rabbit.sender.fanout;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author hongwei
 * @date 2018/11/6 16:05
 */
@Component
public class TopicSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;;

    public void send1(){
        String context = "the sender is TopicSender1!";
        this.rabbitTemplate.convertAndSend("topicExchange","topicQueue",context);
    }

    public void send2(){
        String context = "the sender is TopicSender2!";
        this.rabbitTemplate.convertAndSend("topicExchange","topicQueues",context);
    }
    public void send3(){
        String context = "the sender is TopicSender3!";
        this.rabbitTemplate.convertAndSend("topicExchange","topicQueueaaa",context);
    }
}
