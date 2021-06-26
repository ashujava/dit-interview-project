package com.ditcanada.dao.impl;

import com.ditcanada.dao.UserDao;
import com.ditcanada.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean isVerifiedUser(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password) != null;
    }
}
