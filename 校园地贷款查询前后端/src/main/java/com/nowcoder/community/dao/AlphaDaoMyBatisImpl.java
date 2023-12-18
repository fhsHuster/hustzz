package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository //该注解可以将该方法声明为可扫描的bean
@Primary  //有多个Bean时用该标识符可以优先调用该bean
public class AlphaDaoMyBatisImpl implements AlphaDao{

    @Override
    public String select(){
        return "Mabatis";
    }

}
