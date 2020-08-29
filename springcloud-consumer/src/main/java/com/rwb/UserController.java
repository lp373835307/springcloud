package com.rwb;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/user/list")
    public String queryUsers() {
        String users = restTemplate.getForObject("http://provider/user/list", String.class);

        return users;
    }
}
