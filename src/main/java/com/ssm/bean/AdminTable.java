package com.ssm.bean;


/**
 * 该bean 主要和 数据库的管理员帐号密码表(AdminTable)关联
 */
public class AdminTable {
    private int id;
    private String userName;
    private String password;
    private String jurisdiction;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public AdminTable() {
    }


    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    @Override
    public String toString() {
        return "AdminTable{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", jurisdiction='" + jurisdiction + '\'' +
                '}';
    }

    public AdminTable(String userName, String password, String jurisdiction) {
        this.userName = userName;
        this.password = password;
        this.jurisdiction = jurisdiction;
    }
}
