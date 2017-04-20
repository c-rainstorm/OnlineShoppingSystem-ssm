package com.github.crainstorm.oss.user.entity;

import com.github.crainstorm.oss.util.CheckArgument;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by chen on 4/17/17.
 */
@Component
@Scope("prototype")
public class User {
    private String username;
    private String password;
    private String nickname;
    private String phone;
    private Date birthday;

    public User() {

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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) throws ParseException {
        CheckArgument.notEmpty(birthday, "birthday");
        if (!birthday.matches("\\d{4}-\\d{2}-\\d{2}")) {
            throw new IllegalArgumentException(
                    "The birthday must be like this: 2000-01-01. But your value is " + birthday);
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = dateFormat.parse(birthday);
        this.birthday = new Date(date.getTime());
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", phone='" + phone + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
