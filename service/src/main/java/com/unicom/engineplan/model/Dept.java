package com.unicom.engineplan.model;
//方法的访问修饰符都是public  属性的修饰符是private
public class Dept {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPeoples() {
        return peoples;
    }

    public void setPeoples(int peoples) {
        this.peoples = peoples;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    private int peoples;
    private String deptName;

    public Dept() {
    }

    public Dept(int id, int peoples, String deptName) {
        this.id = id;
        this.peoples = peoples;
        this.deptName = deptName;
    }
}
