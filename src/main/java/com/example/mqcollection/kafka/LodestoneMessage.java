package com.example.mqcollection.kafka;

import java.io.Serializable;
import java.util.Date;

/**
 * @author hongwei
 * @date 2018/11/8 9:16
 */
public class LodestoneMessage implements Serializable {
    private static final long serialVersionUID = -6847574917429814430L;

    private String id;
    private String msg;
    private Date sendTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    @Override
    public String toString() {
        return "LodestoneMessage{" +
                "id='" + id + '\'' +
                ", msg='" + msg + '\'' +
                ", sendTime=" + sendTime +
                '}';
    }
}
