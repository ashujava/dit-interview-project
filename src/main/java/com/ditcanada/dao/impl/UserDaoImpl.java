package com.ditcanada.dao.impl;

import com.ditcanada.dao.UserDao;
import com.ditcanada.entity.UserEntity;
import com.ditcanada.model.User;
import com.ditcanada.repository.UserRepository;
import com.ditcanada.utils.ServiceException;
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

    @Override
    public User addUser(String firstname, String lastname, String username, String password) {

        UserEntity userEntity = new UserEntity();
        User response = new User();
        try{
            userEntity.setFirstname(firstname);
            userEntity.setLastname(lastname);
            userEntity.setUsername(username);
            userEntity.setPassword(password);

            UserEntity entity = userRepository.save(userEntity);
            response.setId(entity.getId());
        }
        catch(Exception e){
            throw new ServiceException(e.getCause());
        }
        return response;
    }


}
