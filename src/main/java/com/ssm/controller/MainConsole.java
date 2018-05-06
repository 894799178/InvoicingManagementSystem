package com.ssm.controller;


import com.ssm.bean.CommodityInfo;
import com.ssm.bean.CustomerInfo;
import com.ssm.bean.SellMain;
import com.ssm.bean.SupplierInfo;
import com.ssm.service.MainConsoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MainConsole {

    @Autowired
    private MainConsoleService mainConsoleService;


    @RequestMapping(value = "/getAllSupplier", method = RequestMethod.GET)
    @ResponseBody
    public List getAllSupplier() {
        return mainConsoleService.getAllSupplier();
    }

    @RequestMapping(value = "/insertItem", method = RequestMethod.POST)
    public String insertItem(SupplierInfo supplierInfo) {
        mainConsoleService.insertItem(supplierInfo);
        return "success";
    }


    @RequestMapping(value = "/getAllCustomer", method = RequestMethod.GET)
    @ResponseBody
    public List<CustomerInfo> getAllCutomer() {
        return mainConsoleService.getAllCustomer();
    }

    @RequestMapping(value = "/getAllItem", method = RequestMethod.GET)
    @ResponseBody
    public List<CommodityInfo> getAllItem() {
        return mainConsoleService.getAllItem();
    }

    @RequestMapping(value="/addItemRecord",method=RequestMethod.POST)
    @ResponseBody
    public String addItemRecord(SellMain sellMain) {
        mainConsoleService.addItemRecord(sellMain);
        return"success";

    }


}
