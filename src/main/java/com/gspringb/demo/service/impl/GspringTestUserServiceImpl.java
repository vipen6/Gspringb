package com.gspringb.demo.service.impl;

import com.gspringb.demo.dto.UserLoginDto;
import com.gspringb.demo.service.GspringTestUserService;
import org.springframework.stereotype.Component;

/**
 * @description: Author:Gnepx
 * @Date:2022-03-12 00:32
 */

//声明之后，才会注入到spring容器，并且可以使用这个类
@Component
public class GspringTestUserServiceImpl implements GspringTestUserService {

    @Override
    public String login(UserLoginDto userLoginDto) {
        return null;
    }
}
