package com.example.mqcollection;

import com.example.mqcollection.rabbit.sender.DirectSender;
import com.example.mqcollection.rabbit.sender.FanoutSender;
import com.example.mqcollection.rabbit.sender.HeardsSender;
import com.example.mqcollection.rabbit.sender.TopicSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

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
    @Resource
    DirectSender directSender;
    @Resource
    HeardsSender heardsSender;

    @Test
    public void fanoutTest() {
        fanoutSender.send();
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void topicTest1() {
        topicSender.send2();
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void directTest1() {
        directSender.send2();
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void hearsTest1() {
        heardsSender.send();
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
