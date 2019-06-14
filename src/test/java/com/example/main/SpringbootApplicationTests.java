package com.example.main;

import com.example.entity.Student;
import com.example.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class SpringbootApplicationTests {

    Logger logger = LoggerFactory.getLogger(SpringbootApplicationTests.class);

    @Autowired
    Student student;
    @Autowired
    ApplicationContext context; //spring ioc容器

    @Test
    public void contextLoads() {
        System.out.println(student);
    }

//    通过xml的方式配置一个bean，自己编写xml配置文件，需要在主类上加上@ImportResource注解，虽然可以用，但是不推荐，推荐使用配置类的方式
    @Test
    public void test(){
        StudentService studentService = (StudentService)context.getBean("studentService");
        System.out.println(studentService);
    }
    
    @Test
    public void testlog(){ //默认日志级别是info
        logger.trace("trace-------------");
        logger.debug("debug-------------");
        logger.info("info---------------");
        logger.warn("warn---------------");
        logger.error("error-------------");
    }
}
