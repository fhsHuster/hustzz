package com.nowcoder.community.controller;

import com.nowcoder.community.service.AlphaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@Controller
@RequestMapping("/alpha")
public class AlphaController {

    @Autowired
    private AlphaService alphaService;

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(){
        return "Hello Spring Boot";
    }

    @RequestMapping("/data")
    @ResponseBody
    public String getData(){
        return alphaService.find();
    }

    @RequestMapping("/http")
    public void http(HttpServletRequest request,HttpServletRequest response){
        //获取请求数据
        System.out.println(request.getMethod());
        System.out.println(request.getServletPath());
        Enumeration<String> enumeration = request.getHeaderNames();
    }

    //Get请求

    // /student?current=1&limit=20  当前是第几页，当页最多显示多少数据

    @RequestMapping(path = "/students",method = RequestMethod.GET)  //规定路径和请求方式为get
    @ResponseBody
    /*//如果刚开始访问时没有current和limit的值，可以使用@RequestParam注解
    * 名为current的参数给current，required=false表示不传这个参数也没有问题
    * 默认值为1*/
    public String getStudent(
            @RequestParam(name = "current",required = false,defaultValue = "1")int current,
            @RequestParam(name = "limit",required = false,defaultValue = "10") int limit){

        System.out.println(current);
        System.out.println(limit);
        return "some students";
    }

    // /student/123
    @RequestMapping(path = "/student/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getStudent(@PathVariable("id") int id){
        System.out.println(id);
        return "a student";
    }

    //post请求
    @RequestMapping(path="/student",method = RequestMethod.POST)
    @ResponseBody
    //参数名与表单中数据的名字一直就可以自动传输
    public String saveStudent(String name, int age){
        System.out.println(name);
        System.out.println(age);
        return "success";
    }

    //相应HTML数据,不加@RequestBody默认返回的是html
    @RequestMapping(path = "/teacher" , method = RequestMethod.GET)
    public ModelAndView getTeacher(){
        ModelAndView mav=new ModelAndView();
        mav.addObject("name","张三");
        mav.addObject("age",30);
        mav.setViewName("/demo/view");
        return mav;

    }

    @RequestMapping(path = "/school" , method = RequestMethod.GET)
    //String 类型返回的是view的路径
    public String getSchool( Model model){
        model.addAttribute("name","北京大学");
        model.addAttribute("age",80);
        return "/demo/view";
    }

    //相应json数据，一般是在异步请求当中
    //Java对象 -> Json字符串 —> Js对象

}
