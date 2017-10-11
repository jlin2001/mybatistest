package com.u3coding.mybatistest.model;

public class Users {
    private String userid;
    private String psw;
    private String email;
    private String name;


    private int id;
    public Users(int id,String userid, String name, String psw, String email) {
        this.id = id;
        this.userid = userid;
        this.name = name;
        this.psw = psw;
        this.email = email;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
