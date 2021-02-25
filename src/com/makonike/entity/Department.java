package com.makonike.entity;

/**
 * 系实体类
 *
 * @author Makonike
 * @date 2021-02-23 10:46
 **/
public class Department {
    private String depNo;
    private String name;
    private String intro;

    public Department() {
    }

    public Department(String depNo, String name, String intro) {
        this.depNo = depNo;
        this.name = name;
        this.intro = intro;
    }

    public String getDepNo() {
        return depNo;
    }

    public void setDepNo(String depNo) {
        this.depNo = depNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    @Override
    public String toString() {
        return "Department{" +
                "depNo='" + depNo + '\'' +
                ", name='" + name + '\'' +
                ", intro='" + intro + '\'' +
                '}';
    }
}
