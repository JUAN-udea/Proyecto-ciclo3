package com.ciclo3.Proyecto.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UsersApplication")
public class UsersApplication {
    @Id
    private String userApplication;
    @Column
    private String passwordUser;
    @Column
    private String mailUser;

    @Column
    private String rolUser ;



    public UsersApplication(String userApplication, String passwordUser, String mailUser, String rolUser) {
        this.userApplication = userApplication;
        this.passwordUser = passwordUser;
        this.mailUser = mailUser;
        this.rolUser = rolUser;
    }

    public UsersApplication() {
    }


    public String getUserApplication() {
        return userApplication;
    }

    public void setUserApplication(String userApplication) {
        this.userApplication = userApplication;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    public String getMailUser() {
        return mailUser;
    }

    public void setMailUser(String mailUser) {
        this.mailUser = mailUser;
    }

    public String getRolUser() {
        return rolUser;
    }

    public void setRolUser(String rolUser) {
        this.rolUser = rolUser;
    }


    @Override
    public String toString() {
        return "UsersApplication{" +
                "userApplication='" + userApplication + '\'' +
                ", passwordUser='" + passwordUser + '\'' +
                ", mailUser='" + mailUser + '\'' +
                ", rolUser='" + rolUser + '\'' +
                '}';
    }
}
