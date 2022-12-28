package com.qiangke.user;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

/**
 * @Description
 * @Author zhangguoq
 * @Date 2022/12/25 01:17
 **/
@RestController
@RequestMapping("/users")
public class UserController {
    @DubboReference(id = "userService",interfaceClass = UserService.class)
//    @Autowired
    private UserService userService;

    @GetMapping("/one")
    public Object getUser(@PathParam(value = "id") Long id) {
        return userService.findUser();
    }
}