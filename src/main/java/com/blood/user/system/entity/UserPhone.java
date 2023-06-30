package com.blood.user.system.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.io.Serializable;

/**
 * 布拉得用户手机信息表(UserPhone)实体类
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserPhone implements Serializable {
    static final long serialVersionUID = 342280670427793377L;
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
     * 用户手机号
     */
    String phoneNumber;
    /**
     * 用户唯一id
     */
    Long userBasicId;
    /**
     * 最后活跃时间
     */
    Date lastActiveTime;

}

