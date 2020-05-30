package me.voson.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author voson
 */
@Document(collection = "organization_device")
public class OrganizationDevice {
    @Id
    private String id;

    @JsonProperty("organization_id")
    @Field("organization_id")
    private String organizationId;

    private ArrayList<String> sns;

    @JsonProperty("update_time")
    @Field("update_time")
    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public ArrayList<String> getSns() {
        return sns;
    }

    public void setSns(ArrayList<String> sns) {
        this.sns = sns;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
