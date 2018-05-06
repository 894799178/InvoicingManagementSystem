package com.ssm.service;

import com.ssm.bean.AdminTable;
import com.ssm.dao.AdminTableMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminTableService {

    @Autowired
    AdminTableMapper adminTableMapper;


    public int login(AdminTable adminTable){
        return adminTableMapper.selectAdminByNumber(adminTable);
    }
}
