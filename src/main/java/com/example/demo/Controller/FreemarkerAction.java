package com.example.demo.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
@RequestMapping(value = "/freemarker")
public class FreemarkerAction {

    /**
     * 日志管理
     */
    private static Logger log = LoggerFactory.getLogger(FreemarkerAction.class);

    /**
     * @param map
     * @return
     * @Title: toDemo
     * @Description: 跳转freemarker页面
     */
    @RequestMapping(value = "/toDemo")
    public String toDemo(Map<String, Object> map) {
        log.info("====>>跳转freemarker页面");
        map.put("name", "jack");
        map.put("success", true);
        List goodsList=new ArrayList();
        Map goods1=new HashMap();
        goods1.put("name", "苹果");
        goods1.put("price", 5.8);
        Map goods2=new HashMap();
        goods2.put("name", "香蕉");
        goods2.put("price", 2.5);
        Map goods3=new HashMap();
        goods3.put("name", "橘子");
        goods3.put("price", 3.2);
        goodsList.add(goods1);
        goodsList.add(goods2);
        goodsList.add(goods3);
        map.put("goodsList", goodsList);
        map.put("today", new Date());
        map.put("point", 102920122);
        return "test";
    }
}