package com.example.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Component //将此javabean放入spring容器
@ConfigurationProperties(prefix = "student")
@Validated //数据校验需要加此注解
//可以通过@PropertySource(value = {"conf.properties"})的形式来加载conf.properties中的数据，但是只能加载properties不能加载yml
public class Student {
//    @Value注解也可以给属性赋值，优先级低于yml，可以互补，并且所有的值都要加双引号
    // @Value("${student.uname}") //通过springEL表达式获取yml中的uname
    private int age;
//    @Value("zs")
    private String name;
    @Email //用jsr303进行数据验证
    private String email;
    private boolean sex;
    private Date birthday;
    private Map<String,Object> location;
    private String[] hobbies;
    private List<String> skills;
    private Pet pet;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Map<String, Object> getLocation() {
        return location;
    }

    public void setLocation(Map<String, Object> location) {
        this.location = location;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", location=" + location +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", skills=" + skills +
                ", pet=" + pet +
                '}';
    }

    public Student() {
    }
}
