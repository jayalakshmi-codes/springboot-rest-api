package com.example.SecurityLombokValidation.service;

import com.example.SecurityLombokValidation.model.Users;
import com.example.SecurityLombokValidation.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class userService {
    @Autowired
    public userRepository ur;


    public List<Users> getuser() {
        return ur.findAll();
    }

    public Users adduser(Users user) {
        return ur.save(user);
    }

    public String deluser(Long id) {
        ur.deleteById(id);
        return "User deleted successfully";
    }

    public Users updateuser(String name, Users user) {
        Optional<Users> userss=ur.findByName(name);
        if(userss.isPresent()){
            Users user1=userss.get();
            user1.setName(user.getName());
            user1.setProduct(user.getProduct());
            user1.setPrice(user.getPrice());
            return ur.save(user1);
        }
        else{
            return null;
        }
    }

    public Optional<Users> getoneuser(String name) {
      return ur.findByName(name);
    }
}
