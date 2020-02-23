package com.soft1851.group1.functional.cyh.fifth;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/2/23
 */
public class StudentRankTest {
    public static void main(String[] args) {
        List<StudentInfo> studentInfoList = new ArrayList<>();
        studentInfoList.add(new StudentInfo("李小明",18,1.76, LocalDate.of(2001,3,23)));
        studentInfoList.add(new StudentInfo("张小丽",18,1.61,LocalDate.of(2001,6,3)));
        studentInfoList.add(new StudentInfo("王大鹏",19,1.82,LocalDate.of(2000,3,11)));
        studentInfoList.add(new StudentInfo("陈小跑",17,1.67,LocalDate.of(2002,10,18)));

        System.out.println("按照年龄升序：");
        studentInfoList.sort(Comparator.comparing(StudentInfo::getAge));
        studentInfoList.forEach(System.out::println);

        System.out.println("按照年龄降序：");
        studentInfoList.sort(Comparator.comparing(StudentInfo::getAge).reversed());
        studentInfoList.forEach(System.out::println);

        System.out.println("按照年龄降序，年龄相同再按照身高升序：");
        studentInfoList.sort(Comparator.comparing(StudentInfo::getAge).reversed().thenComparing(StudentInfo::getHeight));
        studentInfoList.forEach(System.out::println);
    }
}
