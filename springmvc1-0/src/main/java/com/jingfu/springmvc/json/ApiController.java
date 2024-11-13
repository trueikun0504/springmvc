package com.jingfu.springmvc.json;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
@ResponseBody
public class ApiController {

    @PostMapping("/data")
    @ResponseBody
    public String handlePost() {
        System.out.println("post");
        // 处理POST请求
        return "postResponse";
    }

    @GetMapping("/data")
    @ResponseBody
    public String handleGet() {
        // 处理GET请求
        return "getResponse";
    }
}
