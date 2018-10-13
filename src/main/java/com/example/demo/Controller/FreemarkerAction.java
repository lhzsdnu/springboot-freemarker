package com.example.demo.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

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
        return "test";
    }
}