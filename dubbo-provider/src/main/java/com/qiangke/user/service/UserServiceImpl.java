package com.qiangke.user.service;

import com.qiangke.user.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author zhangguoq
 * @Date 2022/12/25 01:23
 **/
//@DubboService(interfaceClass = UserService.class,group = "dubbo",version = "1.0.1",executes = 10)
@Service
public class UserServiceImpl implements UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Override
    public String findUser() {
        logger.error("user");
        return "user";
    }
}
