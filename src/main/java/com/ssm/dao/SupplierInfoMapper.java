package com.ssm.dao;

import com.ssm.bean.SupplierInfo;

import java.util.List;

public interface SupplierInfoMapper {
    List<SupplierInfo> selectAllSupplier();

    SupplierInfo selectSupplierByName(String supplierName);

    SupplierInfo selectSupplierById(Integer id);

    void insertSupplierOne(SupplierInfo supplierInfo);

    void updateSupplierOne(SupplierInfo supplierInfo);

}
