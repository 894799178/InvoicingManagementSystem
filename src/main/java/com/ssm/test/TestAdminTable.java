package com.ssm.test;

import com.ssm.dao.AdminTableMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationConfig.xml"})
public class TestAdminTable {


    @Autowired
    AdminTableMapper adminTableMapper;

    @Autowired
    SqlSession sqlsession;



    @Test
    public void testSelectAdminByPrimaryKey(){
        System.out.println(adminTableMapper.selectAdminByUserName("root"));
    }



}
