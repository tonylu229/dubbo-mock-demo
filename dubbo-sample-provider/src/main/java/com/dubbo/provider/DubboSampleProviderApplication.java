/*
 * @Copyright: 2005-2017 www.2345.com. All rights reserved.
 */
package com.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author luqm
 * @version DubboSampleProviderApplication, v0.1 2019/7/9 11:24
 */
@SpringBootApplication
@ImportResource(locations = "classpath:applicationContext.xml")
public class DubboSampleProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboSampleProviderApplication.class, args);
    }
}
