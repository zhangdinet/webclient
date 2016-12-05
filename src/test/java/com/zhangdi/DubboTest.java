package com.zhangdi;

import com.zhangdi.website.DemoService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.annotation.Resource;

/**
 * Created by hzzhandi3 on 2016/12/5.
 */

@Test
@ContextConfiguration(locations = {"classpath:dubbo-consumer.xml"})
public class DubboTest extends AbstractTestNGSpringContextTests {

    @Resource
    DemoService demoService;

    public void testDubbo(){
        int result = demoService.add(10,20);
        Assert.assertEquals(30,result);
    }
}
