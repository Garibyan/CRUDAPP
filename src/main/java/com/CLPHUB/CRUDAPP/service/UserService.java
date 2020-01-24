package com.CLPHUB.CRUDAPP.service;

import com.CLPHUB.CRUDAPP.model.User;
import com.CLPHUB.CRUDAPP.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> readAllUsers(){
        return userRepository.findAll();
    }

    public User getUserById(Long id){
        return userRepository.getOne(id);
    }
    public User createUser(User user){
        return userRepository.save(user);
    }
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }



}
