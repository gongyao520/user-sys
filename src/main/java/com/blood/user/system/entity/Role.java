package com.blood.user.system.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 角色表(Role)实体类
 *
 * @author makejava
 * @since 2023-06-08 17:57:24
 */
public class Role implements Serializable {
    private static final long serialVersionUID = 841564574500400427L;
    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 是否删除，1是0否
     */
    private String isDel;
    /**
     * 创建时间
     */
    private Date createdAt;
    /**
     * 更新时间
     */
    private Date updatedAt;
    /**
     * 角色名称
     */
    private String name;
    /**
     * 角色描述
     */
    private String description;


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

