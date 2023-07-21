package com.carvajal.users.services;

import com.carvajal.users.entities.Users;
import com.carvajal.users.repository.UsersRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;


@Service
public class UsersServicesImpl implements UsersServices{

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public void save(Users users) {
        usersRepository.save(users);
    }


}
