package com.github.crainstorm.oss.user.entity;

import com.github.crainstorm.oss.util.CheckArgument;

import java.util.List;

/**
 * Created by chen on 4/17/17.
 */
public class User {
    private List<Addr> addrs;
    private String username;
    private String password;
    private String nickname;
    private String phone;
    private String birthday;

    public User() {

    }

    public List<Addr> getAddrs() {
        return addrs;
    }

    public void setAddrs(List<Addr> addrs) {
        this.addrs = addrs;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        CheckArgument.notEmpty(username, "username");
        this.username = username;
        if (nickname == null) {
            this.nickname = username;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        CheckArgument.notEmpty(password, "password");

        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        CheckArgument.notEmpty(nickname, "nickname");

        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        CheckArgument.notEmpty(phone, "phone");
        if (!phone.matches("\\d{11}")) {
            throw new IllegalArgumentException(
                    "The phone number must consist of 11 digits. But your value is " + phone);
        }
        this.phone = phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        CheckArgument.notEmpty(birthday, "birthday");
        if (!birthday.matches("\\d{4}-\\d{2}-\\d{2}")) {
            throw new IllegalArgumentException(
                    "The birthday must be like this: 2000-01-01. But your value is " + birthday);
        }
       this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "addrs=" + addrs +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", phone='" + phone + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
