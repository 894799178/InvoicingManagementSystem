package com.ssm.service;

import com.ssm.bean.CommodityInfo;
import com.ssm.bean.CustomerInfo;
import com.ssm.bean.SellMain;
import com.ssm.bean.SupplierInfo;
import com.ssm.dao.CommodityInfoMapper;
import com.ssm.dao.CustomerInfoMapper;
import com.ssm.dao.SellMainMapper;
import com.ssm.dao.SupplierInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainConsoleService {
    @Autowired
    private SupplierInfoMapper supplierInfoMapper;

    @Autowired
    private CommodityInfoMapper commodityInfoMapper;

    @Autowired
    private CustomerInfoMapper customerInfoMapper;

    @Autowired
    private SellMainMapper sellMainMapper;
    public List<SupplierInfo> getAllSupplier(){
        return supplierInfoMapper.selectAllSupplier();
    }

    /**
     * 更新供应商信息并添加物品.
     * @param supplierInfo
     */
    public void insertItem(SupplierInfo supplierInfo) {
        commodityInfoMapper.insertItem(supplierInfo.getCommodityInfo());

    }


    public List<CustomerInfo> getAllCustomer(){
        return customerInfoMapper.getAllCustomer();
    }

    public List<CommodityInfo> getAllItem(){
        return commodityInfoMapper.getAllItem();
    }

    public void addItemRecord(SellMain sellMain) {
        sellMainMapper.insertSellRecord(sellMain);
    }
}
