package com.example.config;

import com.example.service.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//配置类
@Configuration
public class AppConfig {
    @Bean
    public StudentService studentService(){
        StudentService studentService = new StudentService();
//        如果需要添加Dao,将它set进去，然后就在返回值里面了
//        StudentDao studentDao = new StudentDao();
//        studentService.setStudentDao(studentDao);
        return studentService; //返回值，就是<bean class=''>
    }
}
