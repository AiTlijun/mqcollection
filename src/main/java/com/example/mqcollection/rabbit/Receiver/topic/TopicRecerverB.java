package com.example.mqcollection.rabbit.Receiver.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author hongwei
 * @date 2018/11/6 16:12
 */
@Component
@RabbitListener(queues = "topicQueueB")
public class TopicRecerverB {

    @RabbitHandler
    public void process(String context) {
        System.out.println("TopicRecerverB:" + context);
    }

}
