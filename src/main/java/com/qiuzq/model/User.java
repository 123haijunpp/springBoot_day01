package com.qiuzq.model;

import lombok.ToString;

import java.util.Date;

@ToString
public class User {
    private Integer id;

    private String username;

    private String password;

    private String email;

    private Integer useable;

    private Date addtime;

    private Date logintime;

    private String loginip;

//    @Override
//    public User clone() throws CloneNotSupportedException {
//        return (User) super.clone();
//    }

    public User(Integer id, String username, String password, String email, Integer useable, Date addtime, Date logintime, String loginip) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.useable = useable;
        this.addtime = addtime;
        this.logintime = logintime;
        this.loginip = loginip;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getUseable() {
        return useable;
    }

    public void setUseable(Integer useable) {
        this.useable = useable;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip;
    }
}