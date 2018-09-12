package com.xhustore.domain;

public class User {

    private Long id;

    private String phone;

    private String password;

    private String nickname;

    private String qqNumber;

    private String wechatNumber;

    public User() {

    }

    public User(Long id, String phone, String password, String nickname, String qqNumber, String wechatNumber) {
        super();
        this.id = id;
        this.phone = phone;
        this.password = password;
        this.nickname = nickname;
        this.qqNumber = qqNumber;
        this.wechatNumber = wechatNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getQqNumber() {
        return qqNumber;
    }

    public void setQqNumber(String qqNumber) {
        this.qqNumber = qqNumber;
    }

    public String getWechatNumber() {
        return wechatNumber;
    }

    public void setWechatNumber(String wechatNumber) {
        this.wechatNumber = wechatNumber;
    }

}
