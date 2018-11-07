package com.example.mqcollection.rabbit.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hongwei
 * @date 2018/11/6 15:46
 */
@Configuration
public class DirectExchangeConfig {

    @Bean
    public Queue directQueueA() {
        return new Queue("directQueueA");
    }

    @Bean
    public Queue directQueueB() {
        return new Queue("directQueueB");
    }

    @Bean
    public Queue directQueueC() {
        return new Queue("directQueueC");
    }

    @Bean
    public DirectExchange directExchange(){
        return new DirectExchange("directExchange");
    }

    @Bean
    public Binding directBindingA(DirectExchange directExchange,Queue directQueueA){
        return BindingBuilder.bind(directQueueA).to(directExchange).with("routingKeyA");
    }

    @Bean
    public Binding directBindingB(DirectExchange directExchange,Queue directQueueB){
        return BindingBuilder.bind(directQueueB).to(directExchange).with("routingKeyB");
    }

    @Bean
    public Binding directBindingC(DirectExchange directExchange,Queue directQueueC){
        return BindingBuilder.bind(directQueueC).to(directExchange).with("routingKeyC");
    }
}
