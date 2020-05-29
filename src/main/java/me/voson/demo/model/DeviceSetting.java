package me.voson.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author voson
 * MongoDB会自动创建collection，默认为类名首字母小写，也就是user
 */
@Document(collection="device_setting")
public class DeviceSetting {
    @Id
    private String id;

    @Field("SN")
    private String sn;

    @JsonProperty("device_type")
    @Field("DeviceType")
    private String deviceType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }
}
