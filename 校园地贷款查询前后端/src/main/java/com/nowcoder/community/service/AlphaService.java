package com.nowcoder.community.service;

import com.nowcoder.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
//@Scope("prototype")  //标记为bean为多例，默认值为singleton(不填）
public class AlphaService {

    @Autowired
    private AlphaDao alphaDao;

    public AlphaService(){
        System.out.println("实例化AlphaService");
    }

    @PostConstruct //标记为在构造器之后调用
    public void init(){
        System.out.println("初始化AlphaService");
    }

    @PreDestroy  //标记为在对象销毁之前调用
    public void destory(){
        System.out.println("销毁AlphaService");
    }

    public String find(){
        return  alphaDao.select();
    }

}
