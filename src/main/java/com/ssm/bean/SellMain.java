package com.ssm.bean;

/**
 *  主要销售物品表关联,
 */
public class SellMain {
    private int id;

    private int itemId;

    private int sellItemAmount;

    private double sellMoney;


    public SellMain() {
    }

    @Override
    public String toString() {
        return "SellMain{" +
                "id=" + id +
                ", itemId=" + itemId +
                ", sellItemAmount=" + sellItemAmount +
                ", sellMoney=" + sellMoney +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getSellItemAmount() {
        return sellItemAmount;
    }

    public void setSellItemAmount(int sellItemAmount) {
        this.sellItemAmount = sellItemAmount;
    }

    public double getSellMoney() {
        return sellMoney;
    }

    public void setSellMoney(double sellMoney) {
        this.sellMoney = sellMoney;
    }

    public SellMain(int itemId, int sellItemAmount, double sellMoney) {
        this.itemId = itemId;
        this.sellItemAmount = sellItemAmount;
        this.sellMoney = sellMoney;
    }
}
