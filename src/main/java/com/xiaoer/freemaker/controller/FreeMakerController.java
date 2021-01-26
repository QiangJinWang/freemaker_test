package com.xiaoer.freemaker.controller;

import com.xiaoer.freemaker.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.*;

/**
 * workflowName:
 * description:
 * date: 2021/1/26 14:04
 * author qiangjin.wang
 *
 * @since JDK1.8
 */
@Controller
@RequestMapping("/freeMaker")
public class FreeMakerController {
    @RequestMapping("/hello")
    public String hello(Map<String, Object> map) {
        map.put("name", "wang");
        return "test1";
    }
    @RequestMapping("/show/{name}")
    public String show(Map<String, Object> map, @PathVariable String name) {
        map.put("name", name);
        Student student = new Student();
        student.setName("小明");
        student.setAge(19);
        student.setMoney(100f);
        student.setBirthDay(new Date());
        List<Student> friends = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Student stu = new Student();
            stu.setName("朋友 " + i);
            stu.setAge(i + 99);
            float money = (float) ((1000.00 + 10 * i) * 1.0f);
            stu.setMoney(money);
            friends.add(stu);
        }
        student.setFriends(friends);

        Student best = new Student();
        best.setName("kang kang");
        best.setAge(29);
        student.setBestFriend(best);
        map.put("student", student);
        Map<String, Student> other = new HashMap<>();
        Student a = new Student();
        a.setName("a stu");
        Student b = new Student();
        b.setName("b stu");
        other.put("a", a);
        other.put("b", b);
        map.put("other", other);
        map.put("dotMoney", 3333333333123.123);
        return "test2";
    }
}
