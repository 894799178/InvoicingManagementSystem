package com.ssm.controller;

import com.ssm.bean.AdminTable;
import com.ssm.bean.Tool;
import com.ssm.service.AdminTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Login {

    @Autowired
    AdminTableService adminTableService;

    @Autowired
    Tool tool;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(AdminTable adminTable, HttpServletRequest request) {
        //校验帐号密码是否合法
        if (tool.chkAccountValidity(adminTable.getUserName(), adminTable.getPassword()))
        {
            //登录校验成功跳转页面
            if (adminTableService.login(adminTable) > 0) {
                return "MainConsole";
            }
        }
        request.setAttribute("msg", "帐号或密码错误");
        return "index";
    }


}
