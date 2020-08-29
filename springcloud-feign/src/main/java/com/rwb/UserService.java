package com.rwb;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

// 提供者的名字 , 提供者的spring.application.name
@FeignClient(name = "provider")
@ResponseBody
public interface UserService {

    @RequestMapping("/user/list")
    List<User> users();
}
