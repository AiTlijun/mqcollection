package com.example.mqcollection.rabbit.sender;

import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author hongwei
 * @date 2018/11/7 12:29
 */
@Component
public class HeardersMessagePostProcessor implements MessagePostProcessor {
    @Override
    public Message postProcessMessage(Message message) throws AmqpException {

        
        return null;
    }
}
