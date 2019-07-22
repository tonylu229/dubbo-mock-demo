/*
 * @Copyright: 2005-2017 www.2345.com. All rights reserved.
 */
package com.dubbo;

import com.dubbo.api.DemoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author luqm
 * @version DubboMockApplication, v0.1 2019/7/22 10:28
 */
@SpringBootApplication
@RestController
@ImportResource(value = "classpath:applicationContext.xml")
public class DubboMockApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboMockApplication.class, args);
    }

    @Resource
    private DemoService demoService;

    @GetMapping("/getTest")
    public String getTest(){
        return demoService.say();
    }
}
