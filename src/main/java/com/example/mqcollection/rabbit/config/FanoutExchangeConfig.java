package com.example.mqcollection.rabbit.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hongwei
 * @date 2018/11/6 15:43
 */
@Configuration
public class FanoutExchangeConfig {

    @Bean
    public Queue fanoutQueueA() {
        return new Queue("fanoutQueueA");
    }

    @Bean
    public Queue fanoutQueueB() {
        return new Queue("fanoutQueueB");
    }

    @Bean
    public Queue fanoutQueueC() {
        return new Queue("fanoutQueueC");
    }

    @Bean
    public FanoutExchange fanoutExchange() {
        return new FanoutExchange("fanoutExchange");
    }

    @Bean
    public Binding fanoutBindingA(Queue fanoutQueueA, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(fanoutQueueA).to(fanoutExchange);
    }

    @Bean
    public Binding fanoutBindingB(Queue fanoutQueueB, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(fanoutQueueB).to(fanoutExchange);
    }

    @Bean
    public Binding fanoutBindingC(Queue fanoutQueueC, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(fanoutQueueC).to(fanoutExchange);
    }
}
