package com.example.springbootstudy.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController{

    @Value("${name}")
    public String name;

    @Value("${person.name}")
    public String name1;

    @Autowired
    private Environment env;

    @GetMapping("hello")
    public String Hello()
    {
        System.out.println(name);
        System.out.println(name1);
        System.out.println(env.getProperty("name"));
        return "hello Spring Boot";
    }
}


