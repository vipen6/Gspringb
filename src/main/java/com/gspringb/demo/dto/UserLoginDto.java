package com.gspringb.demo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: Author:Gnepx
 * @Date:2022-03-08 23:03
 */

@ApiModel(value = "用户登录类",description = "请求类")
@Data
public class UserLoginDto {

    @ApiModelProperty(value ="用户名",example = "Gspring",required  =true)
    private String name;

    @ApiModelProperty(value ="用户密码",example = "Gspringpass",required  =true)
    private String pwd;

//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPwd() {
//        return pwd;
//    }
//
//    public void setPwd(String pwd) {
//        this.pwd = pwd;
//    }
}
