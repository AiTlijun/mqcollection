package com.example.mqcollection;

import com.example.mqcollection.kafka.Receive;
import com.example.mqcollection.kafka.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author hongwei
 * @date 2018/11/8 9:23
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class KafkaTest {

    @Resource
    private Sender sender;
    @Resource
    private Receive receive;

    @Test
    public void test(){
        sender.sendMessage();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
