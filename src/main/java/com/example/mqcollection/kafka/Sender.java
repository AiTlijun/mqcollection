package com.example.mqcollection.kafka;

/**
 * @author hongwei
 * @date 2018/11/8 9:15
 */
import java.util.Date;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;

@Component
public class Sender {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void sendMessage() {

        LodestoneMessage message = new LodestoneMessage();
        message.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        message.setMsg(UUID.randomUUID().toString());
        message.setSendTime(new Date());
        System.out.println("  ---------  send mesage  --------> "+JSON.toJSONString(message));
        kafkaTemplate.send("useradvice", JSON.toJSONString(message));
    }
}