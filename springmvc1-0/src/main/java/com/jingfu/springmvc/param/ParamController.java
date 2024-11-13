package com.jingfu.springmvc.param;

import com.jingfu.springmvc.Pojo.UserAccount;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("param")
public class ParamController {

     @RequestMapping(value = "ParamTest",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String ParamTest(@RequestParam String id, @RequestParam String name){
        return "学号"+id+"姓名"+name;
    }

   @PostMapping(value = "value5",produces = "text/html;charset=utf-8")
   @ResponseBody
   public String login( String username, String password) {
       System.out.println("username = " + username + ", password = " + password);
        return "username = " + username + ", password = " + password;
    }

    @PostMapping(value = "value", produces = "text/html;charset=utf-8")
    @ResponseBody
    public String login(@RequestBody UserAccount user) {
        System.out.println("username = " + user.getUsername() + ", password = " + user.getPassword());
        return "username = " + user.getUsername() + ", password = " + user.getPassword();
    }





    @RequestMapping(value = "value2",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String login2(@RequestParam(value = "account") String username,
                         @RequestParam(required = false, defaultValue = "123456") String password)
    {        System.out.println("username = " + username + ", password = " + password);
        return "username = " + username + ", password = " + password;
    }


    @PostMapping(value = "value3", produces = "text/html;charset=utf-8")
    @ResponseBody
    public String login3(@RequestParam(value = "user") List<String> users){
        System.out.println("user = " + users);
        return "user = " + users;
    }

    @RequestMapping(value = "value4",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String login4(@RequestBody UserAccount user){

        System.out.println("user = " + user);
        return "user = " + user.toString();
    }

}
