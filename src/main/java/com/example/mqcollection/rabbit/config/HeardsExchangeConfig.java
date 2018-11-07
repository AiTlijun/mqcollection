package com.example.mqcollection.rabbit.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.HeadersExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hongwei
 * @date 2018/11/6 15:45
 */
@Configuration
public class HeardsExchangeConfig {
    @Bean
    public Queue heardsQueue() {
        return new Queue("heardsQueue");
    }

    @Bean
    public HeadersExchange headersExchange() {
        return new HeadersExchange("headersExchange");
    }

    //messageProperties.setHeader("name", "jack");
    //      messageProperties.setHeader("age", "31");
    @Bean
    public Binding headersBinding(Queue heardsQueue, HeadersExchange headersExchange) {
        Map<String, Object> headers = new HashMap<String, Object>();
        headers.put("name", "jack");
        headers.put("age", "31");
        return BindingBuilder.bind(heardsQueue).to(headersExchange).whereAll(headers).match();
    }
}
