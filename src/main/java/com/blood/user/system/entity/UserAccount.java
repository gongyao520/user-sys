package com.blood.user.system.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.io.Serializable;

/**
 * 布拉得用户账户信息表(UserAccount)实体类
 */
@Data
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserAccount implements Serializable {
    static final long serialVersionUID = 932126791657877230L;
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
     * 用户唯一id
     */
    Long userBasicId;
    /**
     * 昵称
     */
    String nickName;
    /**
     * 头像
     */
    String avatar;
    /**
     * 账户类型名称
     */
    String type;
    /**
     * 账户最后活跃时间
     */
    Date accLastAt;
    /**
     * 对应每个平台下用户唯一id
     */
    String accId;
    /**
     * 每个平台下用户的信息
     */
    String accInfo;

}

