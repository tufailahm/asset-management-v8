package org.training;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("hello")    //localhost:7072/hello?username=riya
    public String hello(@RequestParam("username")String username ){
        return "Hello : "+username + "  Current Date and time is :"+new java.util.Date();
    }

    @RequestMapping("greet")    //localhost:7072/hello?username=riya
    public String hello(){
        return "Hello OFSS";
    }

@RequestMapping("getStatus")    //localhost:7072/hello?username=riya
public String getStatus(){
    return "App status is : Up and Running";
}
}