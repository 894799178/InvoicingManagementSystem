package com.ssm.test;

import com.ssm.bean.SellMain;
import com.ssm.dao.SellMainMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationConfig.xml"})
public class TestSellMain {
    @Autowired
    private SellMainMapper sellMainMapper;

    @Test
    public void testSellMain(){
        SellMain sellMain = new SellMain(1,10,500.0);
        sellMainMapper.insertSellRecord(sellMain);


    }
}
