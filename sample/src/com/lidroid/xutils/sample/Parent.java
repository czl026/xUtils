package com.lidroid.xutils.sample;

import com.lidroid.xutils.db.annotation.Finder;

import java.util.Date;
import java.util.List;

/**
 * Author: wyouflf
 * Date: 13-7-25
 * Time: 下午7:06
 */
public class Parent extends EntityBase {

    public String name;

    private String email;

    private boolean isAdmin;

    public boolean isVIP;

    private Date time;

    private java.sql.Date time2;

    //@Finder(valueColumn = "id",targetColumn = "parentId")
    //public FinderLazyLoader<Parent> parent;
    //@Finder(valueColumn = "id",targetColumn = "parentId")
    //public Parent parent;
    @Finder(valueColumn = "id", targetColumn = "parentId")
    private List<Child> children;

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public java.sql.Date getTime2() {
        return time2;
    }

    public void setTime2(java.sql.Date time2) {
        this.time2 = time2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", isAdmin=" + isAdmin +
                ", isVIP=" + isVIP +
                ", time=" + time +
                ", time2=" + time2 +
                '}';
    }
}
