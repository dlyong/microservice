package com.dlyong.provider.controller;

import com.dlyong.provider.domain.User;
import com.dlyong.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public Map<String ,Object> provideService(@PathVariable("id") String id) {
        System.out.println(userService.getUserInfoById(id).toString());
        User user = userService.getUserInfoById(id);
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("user",user);
        return result;
    }


}
