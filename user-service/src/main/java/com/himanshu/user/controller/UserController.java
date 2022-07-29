package com.himanshu.user.controller;

import com.himanshu.user.VO.ResponseTemplateVO;
import com.himanshu.user.entity.User;
import com.himanshu.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public User saveUser(@RequestBody User user){
        log.info("In saveUser method of userController");
        return userService.saveUser(user);
    }

    @GetMapping("/get/{id}")
    public User getUser(@PathVariable Long id){
        log.info("In getUser method of userController");
        return userService.getUserByUserId(id);
    }

    @GetMapping("/get_with_department/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable Long id){
        return userService.getUserWithDepartment(id);
    }

}
