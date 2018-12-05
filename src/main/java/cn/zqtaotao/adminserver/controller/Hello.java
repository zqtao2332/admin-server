package cn.zqtaotao.adminserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping(name = "/")
    public String hello(){
        return "hello word";
    }
}
