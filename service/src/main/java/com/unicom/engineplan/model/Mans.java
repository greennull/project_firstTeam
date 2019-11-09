package com.unicom.engineplan.model;

public class Mans {
    private int id;
    private String username;
    private String email;
    private String sex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Mans() {
    }

    public Mans(int id, String username, String email, String sex) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.sex = sex;
    }
}
