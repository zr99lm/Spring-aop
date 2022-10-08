package com.zr.service.Impl;

import com.zr.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public int UserServiceMethodTest() {
        System.out.println("UserServiceMethodTest() ");
        int i=1/0;
        return 0;
    }
}
