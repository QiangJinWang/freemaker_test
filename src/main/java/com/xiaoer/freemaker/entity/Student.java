package com.xiaoer.freemaker.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * workflowName:
 * description:
 * date: 2021/1/26 14:02
 * author qiangjin.wang
 *
 * @since JDK1.8
 */
@Data
public class Student {
    private String name;
    private int age;
    private Date birthDay;
    private Float money;
    private List<Student> friends;
    private Student bestFriend;
}
