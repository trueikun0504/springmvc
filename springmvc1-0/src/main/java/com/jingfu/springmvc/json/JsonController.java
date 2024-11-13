package com.jingfu.springmvc.json;

import com.jingfu.springmvc.Pojo.Person;
import com.jingfu.springmvc.Pojo.UserAccount;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("json")
@ResponseBody
public class JsonController {

    @PostMapping(value = "data",produces = "text/html;charset=utf-8")
public String jsonData(@RequestBody UserAccount person){
    System.out.println("person = " + person.toString());
    return person.toString();
    }


}
