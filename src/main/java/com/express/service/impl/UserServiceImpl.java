package com.express.service.impl;

import com.express.dao.UserDao;
import com.express.model.User;
import com.express.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
@Qualifier("A")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public boolean isVerifiedUser(String username, String password) {
        return userDao.findByUsernameAndPassword(username,password) != null;
    }

    @Override
    public User addUser(String firstname, String lastname, String username, String password) {
        return userDao.addUser(firstname, lastname, username, password);
    }

}
