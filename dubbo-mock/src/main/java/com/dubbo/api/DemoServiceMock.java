/*
 * @Copyright: 2005-2017 www.2345.com. All rights reserved.
 */
package com.dubbo.api;


/**
 * @author luqm
 * @version DemoServiceMock, v0.1 2019/7/22 11:16
 */
public class DemoServiceMock implements DemoService {

    @Override
    public String say() {
        return "DemoServiceMock";
    }
}
