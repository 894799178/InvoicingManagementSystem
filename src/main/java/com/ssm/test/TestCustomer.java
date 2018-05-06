package com.ssm.test;


import com.ssm.bean.CommodityInfo;
import com.ssm.dao.CommodityInfoMapper;
import com.ssm.dao.CustomerInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationConfig.xml"})
public class TestCustomer {
    @Autowired
    private CustomerInfoMapper customerInfoMapper;

    @Test
    public void testCustomerInfoMapper(){
        System.out.println(customerInfoMapper.getAllCustomer());

    }
}
