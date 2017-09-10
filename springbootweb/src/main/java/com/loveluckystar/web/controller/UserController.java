package com.loveluckystar.web.controller;

import com.loveluckystar.service.IUserService;
import com.loveluckystar.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mxy on 2017/9/10.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @RequestMapping(value = "/userinfo",method = RequestMethod.GET,produces = "application/json")
    public Object obtainUserInfo(@RequestParam String name){
        return userService.getUserByName(name);
    }
}
