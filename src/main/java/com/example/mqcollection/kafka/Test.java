package com.example.mqcollection.kafka;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hongwei
 * @date 2018/11/7 16:34
 */
public class Test {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("a","A");
        map.put("b","BB");
        map.put("c","CCC");
        map.put("d","DDDD");
        map.put("e","EEEEE");

                /*{ "a", "A"},
        {key: "b", value:Entity2}
        {key: "c", value:Entity3}
        {key: "d", value:Entity4}
        {key: "e", value:Entity5};*/

        String[] keys = {"a", "a" , "b" , "a" ,"d"};
        for( String key : keys){
            Object entity = map.get(key);
            System.out.println(entity);
        }
    }
}
