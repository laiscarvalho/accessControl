package com.dio.accesscontrol.service;

import com.dio.accesscontrol.model.User;
import com.dio.accesscontrol.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserService {
    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public List<User> findAll(){
        return  userRepository.findAll();
    }

    public Optional<User> findById(long userId){
        return userRepository.findById(userId);
    }

    public void deleteUser(long userId){
        userRepository.deleteById(userId);
    }


}
