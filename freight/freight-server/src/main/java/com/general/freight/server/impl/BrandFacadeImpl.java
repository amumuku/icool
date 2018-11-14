package com.general.freight.server.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.general.freight.client.BrandFacade;
import lombok.extern.slf4j.Slf4j;

/**
 * @classname BrandFacadeImpl
 * @description: 测试
 * @author: szy
 * @create: 2018/11/14 10:56
 * @version: 1.0.0
 */
@Slf4j
@Service(version ="1.0.0.szy")
public class BrandFacadeImpl implements BrandFacade {

    @Override
    public String getSayHelloWorld() {
        return "hello world";
    }
}
