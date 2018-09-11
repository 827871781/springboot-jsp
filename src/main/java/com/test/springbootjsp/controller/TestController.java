package com.test.springbootjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * @Author shiyongzhi
 * @Date 2018/8/9 9:34
 * @Version 1.0
 **/
@Controller
public class TestController {

    @RequestMapping("/index")
    public  String  index(){
        System.out.println(1);
        return  "index";
    }
    @RequestMapping(value = {"/", "/view"})
    public String view(Map<String, Object> map) {
        map.put("name", "SpringBoot");
        map.put("date", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        return "index";
    }

    @RequestMapping("toPage")
    public Object topage(ModelAndView mv) {
        mv.setViewName("index");
        return mv;
    }
    @ResponseBody
    @RequestMapping("/test")
    public  String  test(){
        return  "test请求成功";
    }
    @RequestMapping("/hello")
    public String getListaUtentiView(ModelMap map){
        map.put("name", "Spring Boot");
        return "hello";
    }
}
