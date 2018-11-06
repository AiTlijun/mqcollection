package com.example.mqcollection;

import com.example.mqcollection.rabbit.sender.fanout.FanoutSender;
import com.example.mqcollection.rabbit.sender.fanout.TopicSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author hongwei
 * @date 2018/11/6 16:15
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqTest {
    @Autowired
    FanoutSender fanoutSender;
    @Autowired
    TopicSender topicSender;

    @Test
    public void fanoutTest(){
        fanoutSender.send();
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void topicTest1(){
        topicSender.send1();
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
