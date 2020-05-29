package me.voson.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document
public class Organization {
    @Id
    private String id;

    private String name;

    @Field("alarm_url")
    private String alarmURL;

    @Field("device_data_url")
    private String deviceDataURL;

    private String token;

    @Field("create_time")
    private Date createTime;

    @Field("update_time")
    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlarmURL() {
        return alarmURL;
    }

    public void setAlarmURL(String alarmURL) {
        this.alarmURL = alarmURL;
    }

    public String getDeviceDataURL() {
        return deviceDataURL;
    }

    public void setDeviceDataURL(String deviceDataURL) {
        this.deviceDataURL = deviceDataURL;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
