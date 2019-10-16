package com.example.controller;

import com.example.entity.Pet;
import com.example.entity.Student;
import com.example.mapper.StudentMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@EnableAutoConfiguration
public class HelloWorldController {

    //    配置日志输出
    private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @Autowired
    StudentMapper studentMapper;

    @ResponseBody
    @RequestMapping("/helloworld")
//    使用注解（局部跨域）
//    @CrossOrigin("http://localhost:8080")
    public Student helloworld(HttpServletResponse response) {
        // 手动设置响应头允许跨域请求（局部跨域）
        response.setHeader("Access-Control-Allow-Origin", "*");
        Student student = new Student();
        student.setAge(12);
        student.setName("张山");
        student.setEmail("11212113@qq.com");
        logger.debug("helloworld-----------------------");
        return student;
    }

    @RequestMapping("/welcome")
    public String welcome(Map<String, Object> map) {
//        给thymeleaf准备数据
        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet("小哈", "哈士奇"));
        pets.add(new Pet("小黄", "金毛"));
        pets.add(new Pet("小黑", "中华田园犬"));
        map.put("welcome", "thymeleaf");
        map.put("pets", pets);
//        返回result.html
        return "result";
    }

//    测试mybatis融合
    @ResponseBody
    @RequestMapping("/getAll")
    public List<Pet> getAll(HttpServletResponse response){
        List<Pet> pets= studentMapper.getAll();
        System.out.println(pets);
        return pets;
    }
}
