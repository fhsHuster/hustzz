package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    //根据id查询帖子
    List<DiscussPost> selectDiscussPost(int userId, int offset, int limit);

    //查询帖子的行数
    // @Param注解用于给参数取别名
//    如果只有一个参数，并且在<if>里使用，则必须加别名？？？？？存在争议
    int selectDiscussPostRows(@Param("userId") int userId);


}
