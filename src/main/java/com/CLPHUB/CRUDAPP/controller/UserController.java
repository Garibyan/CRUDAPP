package com.CLPHUB.CRUDAPP.controller;


import com.CLPHUB.CRUDAPP.model.User;
import com.CLPHUB.CRUDAPP.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> findAllUsers(){
        return userService.readAllUsers();
    }
    @GetMapping("/getuserbyid/{id}")
    public User getUserById(@PathVariable("id") Long id){
        return userService.getUserById(id);
    }

    @DeleteMapping("user-delete/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
    }

    @PostMapping("user-create")
    public void createUser(User user){
        userService.createUser(user);
    }

    @PutMapping("/user-update/{id}")
    public void updateUser(@PathVariable("id") Long id, Model model){
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        userService.createUser(user);
   }

}
