package com.blood.user.system.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户基础信息表(UserBasic)实体类
 *
 * @author makejava
 * @since 2023-06-08 17:57:24
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserBasic implements Serializable {
    static final long serialVersionUID = -45970037835740875L;

    /**
     * 主键Id
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
     * 名字
     */
    String name;
    /**
     * 昵称
     */
    String nickName;
    /**
     * 血型
     */
    String bloodType;

}

