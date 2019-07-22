/*
 * @Copyright: 2005-2017 www.2345.com. All rights reserved.
 */
package com.dubbo.api.impl;

import com.dubbo.api.DemoService;
import org.springframework.stereotype.Service;

/**
 * @author luqm
 * @version DemoServiceImpl, v0.1 2019/7/22 11:22
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String say() {
        return "provider-DemoService";
    }
}
