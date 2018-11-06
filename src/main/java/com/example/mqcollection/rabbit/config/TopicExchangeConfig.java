package com.example.mqcollection.rabbit.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hongwei
 * @date 2018/11/6 15:45
 */
@Configuration
public class TopicExchangeConfig {

    @Bean
    public Queue topicQueueA() {
        return new Queue("topicQueueA");
    }

    @Bean
    public Queue topicQueueB() {
        return new Queue("topicQueueB");
    }

    @Bean
    public Queue topicQueueC() {
        return new Queue("topicQueueC");
    }

    @Bean
    public TopicExchange topicExchange() {
        return new TopicExchange("topicExchange");
    }

    @Bean
    public Binding topicBindingA(Queue topicQueueA, TopicExchange topicExchange) {
        return BindingBuilder.bind(topicQueueA).to(topicExchange).with("topic.Queue");
    }

    @Bean
    public Binding topicBindingB(Queue topicQueueB, TopicExchange topicExchange) {
        return BindingBuilder.bind(topicQueueB).to(topicExchange).with("topic.Queue.#");
    }

    @Bean
    public Binding topicBindingC(Queue topicQueueC, TopicExchange topicExchange) {
        return BindingBuilder.bind(topicQueueC).to(topicExchange).with("topic.Queue.*");
    }
}
