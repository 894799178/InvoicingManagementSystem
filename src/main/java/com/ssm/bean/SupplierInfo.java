package com.ssm.bean;

public class SupplierInfo {

    private int id;
    private String supplierName;
    private String companyName;
    private String tel;
    private String mail;
    private CommodityInfo commodityInfo;

    public CommodityInfo getCommodityInfo() {
        return commodityInfo;
    }
    public void setCommodityInfo(CommodityInfo commodityInfo) {
        this.commodityInfo = commodityInfo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public SupplierInfo() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    @Override
    public String toString() {
        return "SupplierInfo{" +
                "id=" + id +
                ", supplierName='" + supplierName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", tel='" + tel + '\'' +
                ", mail='" + mail + '\'' +
                ", commodityInfo=" + commodityInfo +
                '}';
    }

    public SupplierInfo(String supplierName, String companyName, String tel, String mail, CommodityInfo commodityInfo) {
        this.supplierName = supplierName;
        this.companyName = companyName;
        this.tel = tel;
        this.mail = mail;
        this.commodityInfo = commodityInfo;
    }

    public SupplierInfo(int id, String supplierName, String companyName, String tel, String mail, CommodityInfo commodityInfo) {
        this.id = id;
        this.supplierName = supplierName;
        this.companyName = companyName;
        this.tel = tel;
        this.mail = mail;
        this.commodityInfo = commodityInfo;
    }
}
