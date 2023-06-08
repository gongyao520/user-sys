package com.blood.user.system.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 布拉得用户账户信息表
(UserAccount)实体类
 *
 * @author makejava
 * @since 2023-06-08 17:57:21
 */
public class UserAccount implements Serializable {
    private static final long serialVersionUID = 932126791657877230L;
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 是否已经删除，0未删除，1已删除
     */
    private String isDel;
    /**
     * 用户唯一id
     */
    private String userBasicId;
    /**
     * 昵称

     */
    private String nickName;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 账户类型名称
     */
    private String accTypeName;
    /**
     * 账户最后活跃时间
     */
    private Date accLastAt;
    /**
     * 创建时间
     */
    private Date createdAt;
    /**
     * 更新时间
     */
    private Date updatedAt;
    /**
     * 对应每个平台下用户唯一id

     */
    private String accUserId;
    /**
     * 每个平台下用户的信息
     */
    private String accUserInfo;


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

    public String getUserBasicId() {
        return userBasicId;
    }

    public void setUserBasicId(String userBasicId) {
        this.userBasicId = userBasicId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAccTypeName() {
        return accTypeName;
    }

    public void setAccTypeName(String accTypeName) {
        this.accTypeName = accTypeName;
    }

    public Date getAccLastAt() {
        return accLastAt;
    }

    public void setAccLastAt(Date accLastAt) {
        this.accLastAt = accLastAt;
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

    public String getAccUserId() {
        return accUserId;
    }

    public void setAccUserId(String accUserId) {
        this.accUserId = accUserId;
    }

    public String getAccUserInfo() {
        return accUserInfo;
    }

    public void setAccUserInfo(String accUserInfo) {
        this.accUserInfo = accUserInfo;
    }

}

