package com.blood.user.system.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.io.Serializable;

/**
 * 角色表(Role)实体类
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Role implements Serializable {
    static final long serialVersionUID = 841564574500400427L;
    /**
     * 主键ID
     */
    Long id;
    /**
     * 创建时间
     */
    Date createdAt;
    /**
     * 更新时间
     */
    Date updatedAt;
    /**
     * 是否删除，1是0否
     */
    Boolean isDel;
    /**
     * 角色名称
     */
    String name;
    /**
     * 角色描述
     */
    String description;

}

