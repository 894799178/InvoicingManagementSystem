package com.ssm.bean;

import java.util.HashMap;

public class Msg {
    private int code;
    private String Msg;
    private HashMap map;


    @Override
    public String toString() {
        return "Msg{" +
                "code=" + code +
                ", Msg='" + Msg + '\'' +
                ", map=" + map +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }

    public HashMap getMap() {
        return map;
    }

    public void setMap(HashMap map) {
        this.map = map;
    }

    public Msg(int code, String msg, HashMap map) {
        this.code = code;
        Msg = msg;
        this.map = map;
    }

    public Msg() {
    }
}
