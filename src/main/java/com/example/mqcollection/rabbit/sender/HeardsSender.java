package com.example.mqcollection.rabbit.sender;

import com.rabbitmq.client.AMQP.BasicProperties;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @author hongwei
 * @date 2018/11/7 10:43
 */
@Component
public class HeardsSender {

    @Resource
    private RabbitTemplate rabbitTemplate;
    @Resource
    private AmqpTemplate amqpTemplate;

    public void send() {

        String context_rabbitTemplate = "rabbitTemplate send's message!";
        String context_amqpTemplate = "amqpTemplate send's message!";
        Map<String, Object> headers = new HashMap<String, Object>();
        headers.put("name", "jack");
        headers.put("age", 31);
        /*BasicProperties basicProperties = new BasicProperties();
        basicProperties.builder().headers(headers);*/
        MessageProperties messageProperties = new MessageProperties();
        messageProperties.setHeader("name", "jack");
        messageProperties.setHeader("age", "31");

        Message message = new Message(context_rabbitTemplate.getBytes(),messageProperties);
       // MessagePostProcessor messagePostProcessor = new MessagePostProcessor();
       // rabbitTemplate.send();
        rabbitTemplate.send("headersExchange",message);
        //amqpTemplate.convertAndSend("headersExchange", messagee);
    }
}
