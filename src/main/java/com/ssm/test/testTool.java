package com.ssm.test;

import com.ssm.bean.Tool;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationConfig.xml"})
public class testTool {


    @Autowired
    private Tool tool;

    @Test
    public void testToolLoginChk(){
            tool.chkAccountValidity("12aaa","55");
    }

}
