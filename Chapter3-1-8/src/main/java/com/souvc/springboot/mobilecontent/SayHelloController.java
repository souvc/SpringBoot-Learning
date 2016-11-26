package com.souvc.springboot.mobilecontent;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SayHelloController {

    @RequestMapping({"/", "/sayHello"})
    public String sayHello() {
        return "sayHello";
    }

}