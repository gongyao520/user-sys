package com.blood.user.system.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 布拉得用户手机信息表(UserPhone)实体类
 *
 * @author makejava
 * @since 2023-06-08 17:57:24
 */
public class UserPhone implements Serializable {
    private static final long serialVersionUID = 342280670427793377L;
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 是否已经删除，0未删除，1已删除
     */
    private String isDel;
    /**
     * 用户手机号
     */
    private String userMobileNum;
    /**
     * 用户唯一id
     */
    private String userBasicId;
    /**
     * 最后活跃时间
     */
    private Date lastActiveTime;
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

    public String getUserMobileNum() {
        return userMobileNum;
    }

    public void setUserMobileNum(String userMobileNum) {
        this.userMobileNum = userMobileNum;
    }

    public String getUserBasicId() {
        return userBasicId;
    }

    public void setUserBasicId(String userBasicId) {
        this.userBasicId = userBasicId;
    }

    public Date getLastActiveTime() {
        return lastActiveTime;
    }

    public void setLastActiveTime(Date lastActiveTime) {
        this.lastActiveTime = lastActiveTime;
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

