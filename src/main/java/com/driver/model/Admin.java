package com.driver.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int adminId;

    String userName;

    String password;

    public Admin() {
    }

    public Admin(int adminId, String userName, String password) {
        this.adminId = adminId;
        this.userName = userName;
        this.password = password;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
