package com.wyh.domain;

import java.util.Date;

public class User {
    private Integer id,flag;
    private String username,password,phone;
    private Date creataedate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreataedate() {
        return creataedate;
    }

    public void setCreataedate(Date creataedate) {
        this.creataedate = creataedate;
    }
}
