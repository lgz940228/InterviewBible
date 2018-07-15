package com.lgz.controller;

import com.lgz.pojo.User;
import com.lgz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by lgz on 2018/7/12.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userServiceImpl;

    @RequestMapping("userList")
    @ResponseBody
    public List<User> userList(){
        //PageHelper.startPage(1,2);
        List<User> users = userServiceImpl.userList();
        return users;
    }
}
