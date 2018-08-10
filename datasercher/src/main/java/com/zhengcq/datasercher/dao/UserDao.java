package com.zhengcq.datasercher.dao;

import com.zhengcq.datasercher.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

    User selectByPrimaryKey(@Param("id") Integer id);
}
