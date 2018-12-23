package com.qiuzq.entity;

import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * program: springBoot_day01
 * Date: 2018/12/23/023 11:55
 *
 * @author: Mr.Qiu
 * Description:
 */
@Entity
@Table(name = "t_user", schema = "springboot", catalog = "")
@ToString
public class TUserEntity {
    private int id;
    private String username;
    private String password;
    private String email;
    private Integer useable;
    private Timestamp addtime;
    private Timestamp logintime;
    private String loginip;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "useable")
    public Integer getUseable() {
        return useable;
    }

    public void setUseable(Integer useable) {
        this.useable = useable;
    }

    @Basic
    @Column(name = "addtime")
    public Timestamp getAddtime() {
        return addtime;
    }

    public void setAddtime(Timestamp addtime) {
        this.addtime = addtime;
    }

    @Basic
    @Column(name = "logintime")
    public Timestamp getLogintime() {
        return logintime;
    }

    public void setLogintime(Timestamp logintime) {
        this.logintime = logintime;
    }

    @Basic
    @Column(name = "loginip")
    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TUserEntity that = (TUserEntity) o;
        return id == that.id &&
                Objects.equals(username, that.username) &&
                Objects.equals(password, that.password) &&
                Objects.equals(email, that.email) &&
                Objects.equals(useable, that.useable) &&
                Objects.equals(addtime, that.addtime) &&
                Objects.equals(logintime, that.logintime) &&
                Objects.equals(loginip, that.loginip);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, username, password, email, useable, addtime, logintime, loginip);
    }

}
