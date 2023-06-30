package com.blood.user.system.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.io.Serializable;

/**
 * 布拉得用户证件信息表(UserCredentials)实体类
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCredentials implements Serializable {
    static final long serialVersionUID = -80185135015419248L;
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
     * 是否已经删除，0未删除，1已删除
     */
    Boolean isDel;
    /**
     * 姓名
     */
    String name;
    /**
     * 证件类型
     */
    String type;
    /**
     * 证件号码
     */
    String number;
    /**
     * 用户唯一id
     */
    Long userBasicId;

}

