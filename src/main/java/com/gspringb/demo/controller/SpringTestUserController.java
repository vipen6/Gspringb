package com.gspringb.demo.controller;

import com.gspringb.demo.dto.UserLoginDto;
import com.gspringb.demo.service.GspringTestUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @description: Author:Gnepx
 * @Date:2022-03-08 22:53
 */
@Api(tags = "测试Swagger集成")
@RestController
public class SpringTestUserController {


    @Autowired//注入bean
    private GspringTestUserService gspringTestUserService;

    @ApiOperation("登录接口")
    @PostMapping("login2")
    public String login2(@RequestBody UserLoginDto userLoginDto){
        String result = gspringTestUserService.login(userLoginDto);
        return  "成功" + result;
    }

    //获取配置文件的值
    @Value("gspring.key1")
    private String gspringkey1;


    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(@RequestBody UserLoginDto userLoginDto){

        System.out.println("userLoginDto.getName()=="+userLoginDto.getName());
        System.out.println("userLoginDto.getPwd()=="+userLoginDto.getPwd());

        return "成功";
    }


    @RequestMapping(value = "byId/{userId}",method = RequestMethod.GET)
    public String getById(@PathVariable("userId") Long userId){

        System.out.println("userID==" + userId);
        return "成功" + userId;
    }


    //@RequestMapping(value = "byId",method = RequestMethod.GET)
    @GetMapping("byId")
    //参数是否必传，默认是必传！getById2 (@RequestParam(value="userId",required = false) Long userId )
    public String getById2(@RequestParam("userId") Long userId , @RequestParam("userId") Long Id){

        System.out.println("RequestParam userID==" + userId);
        System.out.println("RequestParam userID==" + Id);
        return "成功" + userId + "Id=" +Id;
    }

}
