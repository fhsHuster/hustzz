package com.nowcoder.community.service;

import com.nowcoder.community.dao.DiscussPostMapper;
import com.nowcoder.community.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussPostService {

    @Autowired
    private DiscussPostMapper discussPostMapper;
//    userId是一个外键
    public List<DiscussPost> findDiscussPost(int userId, int offset, int limit) {
        return discussPostMapper.selectDiscussPost(userId, offset, limit);
    }
    public int findDisscussPostRows(int userId) {
        return discussPostMapper.selectDiscussPostRows(userId);
    }
}
