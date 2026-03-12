package com.example.SecurityLombokValidation.controller;

import com.example.SecurityLombokValidation.model.Users;
import com.example.SecurityLombokValidation.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class userController {
    @Autowired
    public userService us;

    @GetMapping("/get")
    public List<Users> getuser(){
        return us.getuser();
    }

    @PostMapping("/add")
    public Users adduser(@RequestBody Users user){
        return us.adduser(user);
    }

    @DeleteMapping("/delete/{id}")
    public String deluser(@PathVariable Long id){
        return us.deluser(id);
    }

    @PutMapping("/update/{name}")
    public Users updateuser(@PathVariable String name,@RequestBody Users user){
        return us.updateuser(name,user);
    }
    @GetMapping("/getone/{name}")
    public Optional<Users> getoneuser(@PathVariable String name){
        return us.getoneuser(name);
    }
}
