package com.JPA.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public String addUser(User user){
        userRepository.save(user);
        return "User added";
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User getUserById(int id){
        return userRepository.findById(id).get();
    }

    public String deleteUserById(int id){
        userRepository.deleteById(id);
        return "User deleted";
    }

    public String deleteUsers(){
        userRepository.deleteAll();
        return "All Users deleted";
    }

}
