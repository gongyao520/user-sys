package com.blood.user.system.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户角色关联表(UserRole)实体类
 *
 * @author makejava
 * @since 2023-06-08 17:57:24
 */
public class UserRole implements Serializable {
    private static final long serialVersionUID = -98883139265011170L;
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 创建时间
     */
    private Date createdAt;
    /**
     * 更新时间
     */
    private Date updatedAt;
    /**
     * 用户id
     */
    private String userBasicId;
    /**
     * 角色id
     */
    private String roleId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getUserBasicId() {
        return userBasicId;
    }

    public void setUserBasicId(String userBasicId) {
        this.userBasicId = userBasicId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

}

