package com.ssm.dao;

import com.ssm.bean.CommodityInfo;

import java.util.List;

public interface CommodityInfoMapper {

    void  insertItem(CommodityInfo commodityInfo);

    List<CommodityInfo> getAllItem();
}
