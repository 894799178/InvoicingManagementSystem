package com.ssm.test;


import com.ssm.bean.CommodityInfo;
import com.ssm.dao.CommodityInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationConfig.xml"})
public class TestCommodityInfo {
    @Autowired
    private CommodityInfoMapper commodityInfoMapper;

    @Test
    public void testInsertItem(){
    //    CommodityInfo commodityInfo = new CommodityInfo("y药水3","公司3",3.3,10);
      //  commodityInfoMapper.insertItem(commodityInfo);

        System.out.println(commodityInfoMapper.getAllItem());

    }
}
