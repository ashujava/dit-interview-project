package com.ditcanada.repository;

import com.ditcanada.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByUsernameAndPassword(String username, String password);

}
