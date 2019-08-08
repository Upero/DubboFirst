package cn.controller;

import cn.springb.UserService.UserService;
import cn.springb.userBean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/findbyid/{id}")
    public User findbyId(@PathVariable("id") Integer id) {
        return userService.FindById(id);
    }

    @RequestMapping("/hello")
    public String helloworld() {
        return "helloworld";
    }
}
