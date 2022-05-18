package com.example.study;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class test {
    @ResponseBody
    @RequestMapping("/test")
    public String hello() {
        String s = "s";
        s = s + "123";
        return s;
    }
}
