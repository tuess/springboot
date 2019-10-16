package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import javax.swing.*;

//springboot的主配置类
@SpringBootApplication
//需要加上@ComponentScan注解，或者将SpringbootApplication放到所有包的上层，否则只会扫描SpringbootApplication所在的包及其子包
//@ComponentScan(basePackages={"com.example.entity"})
//需要将自己写的配置文件加入spring boot中需要加上@ImportResource注解,但不推荐这样做，而是通过配置类的方式来做
//@ImportResource(locations = {"classpath:spring.xml"})
public class SpringbootApplication {
//    spring boot将静态资源存入到jar包中，将webjars的dependency引入pom中: 从Jar目录结构的webjars开始写：http://localhost:8080/webjars/jquery/3.4.1/dist/jquery.js
//    我们的静态资源直接放入这些目录即可 。目录在哪里？ ResourceProperties类中的CLASSPATH_RESOURCE_LOCATIONS中设置：
//	 {
//			"classpath:/META-INF/resources/", "classpath:/resources/",
//			"classpath:/static/", "classpath:/public/"
//	 }
// 	注意：在以上目录存放资源文件后，访问时  不需要加前缀，直接访问即可：http://localhost:8080/world.html
//如何自定义静态资源目录（Properties文件中的 prefix+属性） ：
//spring.resources.static-locations=classpath:/res/, classpath:/img/
//以上就将 静态资源目录设置为了classpath:/res/, classpath:/img/ ，注意 自定义静态资源目录后  以前默认的目录会失效
//使用thymeleaf只需要将 文件放入目录："classpath:/templates/";  文件的后缀： ".html";

//    Spring boot整合JSP开发
//    之前spring boot默认 自带一个内置的tomcat，不需要打war包，直接通过Jar即可运行。
//    但是，如果要整合jsp开发，就需要 单独配置一个 外置的tomcat ，需要打war包。
//    Spring boot整合JSP开发步骤：
//            1.新建boot项目， war
//    注意：
//		<dependency>
//			<groupId>org.springframework.boot</groupId>
//			<artifactId>spring-boot-starter-tomcat</artifactId>
//			<scope>provided</scope>
//		</dependency>
//    provided：意思是 将项目打包时，不需要将内置的tomcat一起打包。
//
//    2.建立基本的web项目所需要的目录结构
//    webapps/WEB-INF(需要)
//    webapps/WEB-INF/web.xml (不需要)
//    webapps/index.jsp
//		3.创建tomcat实例、部署项目
//    访问：
//    域名：端口/项目名/文件名
//    http://localhost:8080/SbJSP/index.jsp

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
