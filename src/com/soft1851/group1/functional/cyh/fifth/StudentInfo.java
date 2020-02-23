package com.soft1851.group1.functional.cyh.fifth;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/2/23
 */
public class StudentInfo {
    private String name;
    private Integer age;
    private Double height;
    private LocalDate birthday;

    public StudentInfo() {
        super();
    }

    public StudentInfo(String name, Integer age, Double height, LocalDate birthday) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return
                "姓名：" + name +
                        ", 年龄：" + age +
                        ", 身高：" + height +
                        ", 生日：" + birthday;
    }
}
