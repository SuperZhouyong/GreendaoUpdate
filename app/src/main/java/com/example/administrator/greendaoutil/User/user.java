package com.example.administrator.greendaoutil.User;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Transient;
import org.greenrobot.greendao.annotation.Generated;

/**
 * @data 2017/3/16 0016
 * @aurher Administrator
 */
@Entity
public class user {
    @Id
    private long id;
    private String userName;
    private String Code ;
    private String Fneshu ;
    private int age;
    @Transient
    private String gender;
    @Generated(hash = 1586145367)
    public user(long id, String userName, String Code, String Fneshu, int age) {
        this.id = id;
        this.userName = userName;
        this.Code = Code;
        this.Fneshu = Fneshu;
        this.age = age;
    }
    @Generated(hash = 591315204)
    public user() {
    }
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getUserName() {
        return this.userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getCode() {
        return this.Code;
    }
    public void setCode(String Code) {
        this.Code = Code;
    }
    public String getFneshu() {
        return this.Fneshu;
    }
    public void setFneshu(String Fneshu) {
        this.Fneshu = Fneshu;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}
