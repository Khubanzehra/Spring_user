package com.example.demo.ServiceImpl;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepo;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
      @Autowired
    UserRepo userRepo;
    @Override
    public String addUser(User user){
        userRepo.save(user);
        return "sucess";
    }
}
