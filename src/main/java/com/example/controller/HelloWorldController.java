package com.example.controller;

import com.example.entity.Pet;
import com.example.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@EnableAutoConfiguration
public class HelloWorldController {

    @ResponseBody
    @RequestMapping("/helloworld")
     public Student helloworld(){
        Student student = new Student();
        student.setAge(12);
        student.setName("张山");
        student.setEmail("11212113@qq.com");
        return student;
    }

    @RequestMapping("/welcome")
    public String welcome(Map<String,Object> map){
//        给thymeleaf准备数据
        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet("小哈","哈士奇"));
        pets.add(new Pet("小黄","金毛"));
        pets.add(new Pet("小黑","中华田园犬"));
        map.put("welcome","thymeleaf");
        map.put("pets",pets);
        return "result";
    }
}
