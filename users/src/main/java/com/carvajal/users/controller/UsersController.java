package com.carvajal.users.controller;

import com.carvajal.users.entities.Users;
import com.carvajal.users.services.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users/")
@CrossOrigin("*")
public class UsersController {

    @Autowired
    private UsersServices usersServices;
    @PostMapping("save")
    public void save(@RequestBody Users users) {
        usersServices.save(users);
    }
}
