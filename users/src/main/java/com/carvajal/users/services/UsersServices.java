package com.carvajal.users.services;

import com.carvajal.users.entities.Users;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public interface UsersServices {
    void save(Users users);


}
