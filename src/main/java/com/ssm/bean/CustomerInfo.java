package com.ssm.bean;


/**
 * 该bean 主要是和 顾客表想关联.
 */
public class CustomerInfo {
    private int id;

    private String customentName;

    private String tel;

    private String mail;

    private SellMain sellItem;

    public CustomerInfo() {
    }

    @Override
    public String toString() {
        return "CustomerInfo{" +
                "id=" + id +
                ", customentName='" + customentName + '\'' +
                ", tel='" + tel + '\'' +
                ", mail='" + mail + '\'' +
                ", sellItem=" + sellItem +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomentName() {
        return customentName;
    }

    public void setCustomentName(String customentName) {
        this.customentName = customentName;
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

    public SellMain getSellItem() {
        return sellItem;
    }

    public void setSellItem(SellMain sellItem) {
        this.sellItem = sellItem;
    }

    public CustomerInfo(String customentName, String tel, String mail, SellMain sellItem) {
        this.customentName = customentName;
        this.tel = tel;
        this.mail = mail;
        this.sellItem = sellItem;
    }
}
