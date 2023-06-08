package com.blood.user.system.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 权限表(Permission)实体类
 *
 * @author makejava
 * @since 2023-06-08 17:57:24
 */
public class Permission implements Serializable {
    private static final long serialVersionUID = -93508775428857698L;
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
     * 权限名称
     */
    private String name;
    /**
     * 描述
     */
    private String description;


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

