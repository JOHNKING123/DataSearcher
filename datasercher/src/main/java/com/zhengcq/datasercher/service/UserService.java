package com.zhengcq.datasercher.service;

import com.zhengcq.datasercher.dao.UserDao;
import com.zhengcq.datasercher.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getById(Integer id){

        return userDao.selectByPrimaryKey(id);
    }
}
