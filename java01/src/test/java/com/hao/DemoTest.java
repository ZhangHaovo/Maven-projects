package com.hao;

import org.junit.Assert;
import org.junit.Test;

public class DemoTest {
    @Test
    public void testSay(){
        Demo d = new Demo();
        String ret = d.say("zhanghao");
        Assert.assertEquals("hello zhanghao",ret);      //断言
    }
}
