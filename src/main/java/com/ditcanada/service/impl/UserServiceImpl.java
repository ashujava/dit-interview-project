package com.ditcanada.service.impl;

import com.ditcanada.dao.UserDao;
import com.ditcanada.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public boolean isVerifiedUser(String username, String password) {
        return userDao.isVerifiedUser(username,password);
    }
}
