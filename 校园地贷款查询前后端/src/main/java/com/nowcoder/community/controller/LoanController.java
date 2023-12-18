package com.nowcoder.community.controller;
import com.nowcoder.community.entity.LoanInfo;
import com.nowcoder.community.service.LoanService;
import com.nowcoder.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")
public class LoanController {
    @Autowired
    private LoanService loanService;

    @GetMapping("/loan")
    public String getBalanceByStudentId(@RequestParam(name = "xueHao", required = false) String xueHao, Model model) {
        // 检查学号的有效性等任何必要的验证
        if(xueHao != null) {
            System.out.println(xueHao);
            // 调用 StudentService 中的方法查询余额
            LoanInfo info = loanService.findLoanByxueHao(xueHao);
            if(info == null) {
                int error = 1;
                model.addAttribute("error" , error);
            }
//            model.addAttribute("xueHao", xueHao);
            model.addAttribute("info", info);
        }
        return "/search2";

    }

}
