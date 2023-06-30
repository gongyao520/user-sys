package com.blood.user.system.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户角色关联表(UserRole)实体类
 *
 * @author makejava
 * @since 2023-06-08 17:57:24
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRole implements Serializable {
    static final long serialVersionUID = -98883139265011170L;
    /**
     * 主键id
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
     * 用户id
     */
    Long userBasicId;
    /**
     * 角色id
     */
    Long roleId;

}

