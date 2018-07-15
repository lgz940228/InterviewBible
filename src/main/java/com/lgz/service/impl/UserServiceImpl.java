package com.lgz.service.impl;

import com.github.pagehelper.PageHelper;
import com.lgz.Mapper.UserMapper;
import com.lgz.pojo.User;
import com.lgz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lgz on 2018/7/12.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> userList() {
        //PageHelper.startPage(1,2);
        List<User> users = userMapper.userList();
        return users;
    }
}
