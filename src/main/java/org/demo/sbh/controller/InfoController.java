package org.demo.sbh.controller;

import org.demo.sbh.entity.User;
import org.demo.sbh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InfoController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/save")
    public String save() {
        User user = new User("username1", "password1", "nickname1");
        userService.save(user);
        return "{'message':'success'}";
    }

    @RequestMapping(value = "/findAll")
    public List<User> findAll() {
        List<User> list = userService.findAll();
        return list;
    }

}
