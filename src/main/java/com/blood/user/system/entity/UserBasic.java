package com.blood.user.system.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户基础信息表(UserBasic)实体类
 *
 * @author makejava
 * @since 2023-06-08 17:57:24
 */
public class UserBasic implements Serializable {
    private static final long serialVersionUID = -45970037835740875L;
    
    private Integer id;
    
    private String name;
    
    private String nickname;
    
    private String avatar;
    
    private String bloodtype;
    
    private Date createdat;
    
    private Date updatedat;
    
    private Date deletedat;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }

    public Date getUpdatedat() {
        return updatedat;
    }

    public void setUpdatedat(Date updatedat) {
        this.updatedat = updatedat;
    }

    public Date getDeletedat() {
        return deletedat;
    }

    public void setDeletedat(Date deletedat) {
        this.deletedat = deletedat;
    }

}

