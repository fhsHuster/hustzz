//package com.nowcoder.community;
//
//import com.nowcoder.community.dao.DiscussPostMapper;
//import com.nowcoder.community.dao.LoanInfoMapper;
//import com.nowcoder.community.entity.DiscussPost;
//import com.nowcoder.community.entity.LoanInfo;
//import com.nowcoder.community.service.LoanService;
//import com.nowcoder.community.service.UserService;
//import org.junit.runner.RunWith;
//import com.nowcoder.community.dao.UserMapper;
//import com.nowcoder.community.entity.User;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.List;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@ContextConfiguration(classes = CommunityApplication.class)
//class MapperTests {
//
//    @Autowired
//    private LoanService loanService;
//
//    @Autowired
//    private UserMapper userMapper;
//
//    @Autowired
//    private DiscussPostMapper discussPostMapper;
//
//    @Autowired
//    private UserService userService;
//
//    @Test
//    public void testSelectUser() {
//        User user = userMapper.selectById(101);
//        System.out.println(user);
//
//        LoanInfo res = loanService.findLoanByxueHao("D202180975");
//        System.out.println(res);
//
//        user = userMapper.selectByName("liubei");
//        System.out.println(user);
//    }
//    @Test
//    public void updateUser() {
//        int rows = userMapper.updateStatus(150, 1);
//        System.out.println(rows);
//    }
//
////    @org.junit.Test
////    public void loanTests() {
////        LoanInfo res = loanService.findLoanByxueHao("D202180975");
////        System.out.println(res);
////    }
//
//    @Test
//    public void testSelectPosts() {
//        List<DiscussPost> list=discussPostMapper.selectDiscussPost(149, 0, 10);
//        for (DiscussPost post:list) {
//            System.out.println(post);
//        }
//        int rows = discussPostMapper.selectDiscussPostRows(149);
//        System.out.println(rows);
//    }
//
//    /**
//     *
//     */
////    @Test
////    public void searchLoan1() {
//////        String xueHao = "nowcoder11";
////        String res = userMapper.searchLoan("nowcoder11");
////        System.out.println(res);
////    }
//}
//
//
