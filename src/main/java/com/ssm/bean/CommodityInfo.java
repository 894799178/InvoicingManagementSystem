package com.ssm.bean;

/**
 * 该bean 主要是和数据库的物品信息表像关联
 */
public class CommodityInfo {
    private int id;
    private String itemName;
    private String supplierName;
    private double price;
    private int amount;


    @Override
    public String toString() {
        return "CommodityInfo{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public CommodityInfo() {
    }

    public CommodityInfo(String itemName, String supplierName, double price, int amount) {
        this.itemName = itemName;
        this.supplierName = supplierName;
        this.price = price;
        this.amount = amount;
    }
}
