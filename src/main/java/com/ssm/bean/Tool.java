package com.ssm.bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Tool {


    /**
     * 校验帐号密码的合法性
     * @return
     */
    public boolean chkAccountValidity(String userName,String password){
        String userNameReg = "[a-zA-Z0-9_]{3,16}";
        String passwordReg = "[a-zA-Z0-9_]{5,18}";
        if(!userName.matches(userNameReg)){
            return false;
        }else if (!password.matches(passwordReg)){
            return false;
        }

        return true;
    }

}
