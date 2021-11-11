package com.learn.seckill.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "t_user")
public class User {
    /**
     * 用户ID
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    @TableField(value = "nickname")
    private String nickname;

    /**
     * MD5(MD5(pass明文+固定salt)+salt)
     */
    @TableField(value = "`password`")
    private String password;

    @TableField(value = "salt")
    private String salt;

    /**
     * 头像
     */
    @TableField(value = "head")
    private String head;

    /**
     * 注册时间
     */
    @TableField(value = "register_date")
    private Date registerDate;

    /**
     * 最后一次登录时间
     */
    @TableField(value = "last_login_date")
    private Date lastLoginDate;

    /**
     * 登录次数
     */
    @TableField(value = "login_count")
    private Integer loginCount;
}