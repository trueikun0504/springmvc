package com.jingfu.springmvc.hellocontroller;

import com.jingfu.springmvc.Pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET,
            produces = "text/html;charset=utf-8")
    @ResponseBody
    public String Hello() {
        System.out.println("Hello SpringMvc");//返回控制台
        return "学号：2212406010240 姓名：朱鑫";//返回的显示页面
    }


}
