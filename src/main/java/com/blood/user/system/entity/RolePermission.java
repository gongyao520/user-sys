package com.blood.user.system.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.io.Serializable;

/**
 * 角色权限关联表(RolePermission)实体类
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RolePermission implements Serializable {
    static final long serialVersionUID = -80585515652581667L;
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
     * 角色id
     */
    Long roleId;
    /**
     * 权限id
     */
    Long permissionId;

}

