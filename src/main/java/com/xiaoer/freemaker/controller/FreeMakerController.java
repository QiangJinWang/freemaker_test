package com.xiaoer.freemaker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Map;

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
}
