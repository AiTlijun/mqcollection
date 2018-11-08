package com.example.mqcollection.kafka;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author hongwei
 * @date 2018/11/8 11:18
 */
@Component
@KafkaListener(topics = "useradvice")
public class Receive {

    @Resource
    private KafkaTemplate kafkaTemplate;

    @KafkaHandler
    public void process(String lodestoneMessage) {
        //kafkaTemplate
        System.out.println("接收到对象信息：" + lodestoneMessage);
        JSONObject jsonObject = JSON.parseObject(lodestoneMessage);
        LodestoneMessage message = JSON.parseObject(lodestoneMessage, new TypeReference<LodestoneMessage>() {
        });
        System.out.println("接收到对象信息字符转JSONObject对象信息：" + jsonObject.getString("id"));
        System.out.println("接收到对象信息字符转LodestoneMessage对象信息：" + message.toString());

    }
}
