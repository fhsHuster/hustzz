package com.nowcoder.community.dao;

import com.nowcoder.community.entity.LoanInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoanInfoMapper {
    LoanInfo selectByxueHao(String xueHao);
}
