package com.nowcoder.community.service;

import com.nowcoder.community.dao.UserMapper;
import com.nowcoder.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//iii
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User findUserById(int id) {

        return userMapper.selectById(id);
    }

    public String findLoad(String xueHao) {
        return userMapper.searchLoan(xueHao);
    }
}
