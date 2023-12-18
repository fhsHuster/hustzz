package com.nowcoder.community.dao;

import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

//@Repository 用这个注解也可以
@Mapper
public interface UserMapper {

    String searchLoan(String xueHao);

    User selectById(int id);

    User selectByName(String name);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(int id, int status);

    int updateHeader(int id, int headerUrl);

    int updatePassword(int id, String password);

}
