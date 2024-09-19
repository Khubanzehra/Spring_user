package com.example.demo.Controller;

import com.example.demo.Model.User;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/v1/user")



public class UserController {

    @Autowired
    UserService userService;
    @PostMapping(path="/signUp")
    public @ResponseBody String  trigger(@RequestBody User user){
       return userService.addUser(user);
    }

}
