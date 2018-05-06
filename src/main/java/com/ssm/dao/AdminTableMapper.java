package com.ssm.dao;

import com.ssm.bean.AdminTable;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminTableMapper {
     AdminTable selectAdminByUserName(String userName);

     Integer selectAdminByNumber(AdminTable adminTable);
}
