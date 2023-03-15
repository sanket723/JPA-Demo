package com.JPA.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/get-users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/get-user-by-rollNo")
    public User getUserById(@RequestParam("id") int id){
        return userService.getUserById(id);
    }

    @DeleteMapping("/delete-user-by-rollNo")
    public String deleteUserById(@RequestParam("id") int id){
        return userService.deleteUserById(id);
    }

    @DeleteMapping("/delete-users")
    public String deleteUsers(){
        return userService.deleteUsers();
    }

}
