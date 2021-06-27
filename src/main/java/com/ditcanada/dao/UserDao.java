package com.ditcanada.dao;

import com.ditcanada.model.User;

public interface UserDao {

    boolean isVerifiedUser (String username, String password);

    User addUser(String firstname, String lastname, String username, String password);


}
