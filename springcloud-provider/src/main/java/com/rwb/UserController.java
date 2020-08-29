package com.rwb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @RequestMapping("/user/list")
    public List<User> queryUsers() {

        System.out.println("start ....");

        List<User> users = new ArrayList<>();
        User user = new User("zhangsan", 18);
        User user1 = new User("lisi", 22);

        users.add(user);
        users.add(user1);

        return users;
    }
}
