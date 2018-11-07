package com.example.mqcollection.rabbit.Receiver.heards;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author hongwei
 * @date 2018/11/7 10:41
 */
@Component
@RabbitListener(queues = "heardsQueue")
public class HeardsRecerver {

    @RabbitHandler
    public void process(String context) {
        System.out.println("HeardsRecerver:" + context);
    }
}
