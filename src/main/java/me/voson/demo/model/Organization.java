package me.voson.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * @author voson
 */
@Document
public class Organization {
    @Id
    private String id;

    private String name;

    @JsonProperty("alarm_url")
    @Field("alarm_url")
    private String alarmUrl;

    @JsonProperty("device_data_url")
    @Field("device_data_url")
    private String deviceDataUrl;

    private String token;

    @JsonProperty("create_time")
    @Field("create_time")
    private Date createTime;

    @JsonProperty("update_time")
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

    public String getAlarmUrl() {
        return alarmUrl;
    }

    public void setAlarmUrl(String alarmUrl) {
        this.alarmUrl = alarmUrl;
    }

    public String getDeviceDataUrl() {
        return deviceDataUrl;
    }

    public void setDeviceDataUrl(String deviceDataUrl) {
        this.deviceDataUrl = deviceDataUrl;
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
