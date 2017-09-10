package com.loveluckystar.service.impl;

import com.loveluckystar.dao.domain.User;
import com.loveluckystar.dao.mapper.UserMapper;
import com.loveluckystar.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mxy on 2017/9/10.
 */
@Service
public class UserService implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByName(String name){
        return userMapper.findByName(name);
    }
}
