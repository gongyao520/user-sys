package com.blood.user.system.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 布拉得用户证件信息表(UserCredentials)实体类
 *
 * @author makejava
 * @since 2023-06-08 17:57:24
 */
public class UserCredentials implements Serializable {
    private static final long serialVersionUID = -80185135015419248L;
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 是否已经删除，0未删除，1已删除
     */
    private String isDel;
    /**
     * 姓名
     */
    private String name;
    /**
     * 证件类型
     */
    private String credentialsType;
    /**
     * 证件号码
     */
    private String credentialsNum;
    /**
     * 用户唯一id
     */
    private String userBasicId;
    /**
     * 创建时间
     */
    private Date createdAt;
    /**
     * 更新时间
     */
    private Date updatedAt;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCredentialsType() {
        return credentialsType;
    }

    public void setCredentialsType(String credentialsType) {
        this.credentialsType = credentialsType;
    }

    public String getCredentialsNum() {
        return credentialsNum;
    }

    public void setCredentialsNum(String credentialsNum) {
        this.credentialsNum = credentialsNum;
    }

    public String getUserBasicId() {
        return userBasicId;
    }

    public void setUserBasicId(String userBasicId) {
        this.userBasicId = userBasicId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}

