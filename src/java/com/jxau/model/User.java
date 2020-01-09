package com.jxau.model;

import java.io.Serializable;

public class User implements Serializable {
    private int userid;
    private String username;
    private String passwd;
    private String tel;
    private String sex;
    private int age;

    public User(int userid, String username, String passwd, String tel, String sex, int age) {
        this.userid = userid;
        this.username = username;
        this.passwd = passwd;
        this.tel = tel;
        this.sex = sex;
        this.age = age;
    }

    public User() {
    }

    public User(String username, String passwd, String tel, String sex, int age) {
        this.username = username;
        this.passwd = passwd;
        this.tel = tel;
        this.sex = sex;
        this.age = age;
    }

    public User(String username, String pwd) {
        this.username = username;
        this.passwd = pwd;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString()  {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", passwd='" + passwd + '\'' +
                ", tel='" + tel + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
