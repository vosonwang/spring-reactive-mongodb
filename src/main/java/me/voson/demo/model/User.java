package me.voson.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;
import java.util.Date;

/**
 * @author voson
 */
public class User {

    private Long id;

    @JsonProperty("user_name")
    private String userName;

    private String email;
    private String mobile;

    /**
     * 生成json时不生成hash_password属性
     */
    @JsonIgnore
    private byte[] hashPassword;

    @JsonProperty("organization_id")
    private long organizationId;

    @JsonProperty("role_id")
    private long roleId;

    @JsonProperty("create_time")
    private Date createTime;

    @JsonProperty("update_time")
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public byte[] getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(byte[] hashPassword) {
        this.hashPassword = hashPassword;
    }

    public long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(long organizationId) {
        this.organizationId = organizationId;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
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

    @Override
    public String toString() {
        return String.format("User{ name: %s,email: %s,mobile: %s,hash_password: %s,create_time: %s,update_time: %s }",
                userName, email, mobile, Arrays.toString(hashPassword), createTime, updateTime);
    }
}
