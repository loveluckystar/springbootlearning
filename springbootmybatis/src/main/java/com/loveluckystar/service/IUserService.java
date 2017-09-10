package com.loveluckystar.service;

import com.loveluckystar.dao.domain.User;

/**
 * Created by mxy on 2017/9/10.
 */
public interface IUserService {
    public User getUserByName(String name);
}
