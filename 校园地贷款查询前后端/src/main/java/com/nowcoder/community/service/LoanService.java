package com.nowcoder.community.service;

import com.nowcoder.community.dao.LoanInfoMapper;
import com.nowcoder.community.entity.LoanInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanService {
    @Autowired
    private LoanInfoMapper loanInfoMapper;

    public LoanInfo findLoanByxueHao(String xueHao) {
        return loanInfoMapper.selectByxueHao(xueHao);
    }
}
