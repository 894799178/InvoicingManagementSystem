package com.ssm.test;

import com.ssm.bean.SupplierInfo;
import com.ssm.dao.SupplierInfoMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationConfig.xml"})
public class TestSupplierInfo {

    @Autowired
    SupplierInfoMapper supplierInfoMapper;

    @Autowired
    SqlSession sqlsession;


    @Test
    public void testGetSupplier(){
        System.out.println(supplierInfoMapper.selectAllSupplier());
    }

    @Test
    public void testUpdateSupplier(){

       // supplierInfoMapper.updateSupplierOne( new SupplierInfo(1,"aa",null,"123456","123456",null));
    }
}
