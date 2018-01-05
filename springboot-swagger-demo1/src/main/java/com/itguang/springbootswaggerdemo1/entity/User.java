package com.itguang.springbootswaggerdemo1.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author itguang
 * @create 2017-12-30 14:39
 **/
@Data
public class User {

    @ApiModelProperty(hidden = true)
    private String id;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;
    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(hidden = true)
    private Integer age;

    @ApiModelProperty(hidden = true)
    private Boolean enabled;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;

    }

    public User(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
