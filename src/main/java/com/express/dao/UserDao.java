package com.express.dao;

import com.express.entity.UserEntity;
import com.express.model.User;

public interface UserDao {

    UserEntity findByUsername (String username);

    UserEntity findByUsernameAndPassword (String username, String password);

    User addUser(String firstname, String lastname, String username, String password);


}
