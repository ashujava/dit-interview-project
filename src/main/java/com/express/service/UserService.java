package com.express.service;

import com.express.model.User;

public interface UserService {

    boolean isVerifiedUser (String username, String password);

    User addUser(String firstname, String lastname, String username, String password);

}
