/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Asus
 */
public class manager {

    private String userName;
    private String passWork;

    public manager() {
    }

    public manager(String userName, String passWork) {
        this.userName = userName;
        this.passWork = passWork;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWork() {
        return passWork;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWork(String passWork) {
        this.passWork = passWork;
    }

    @Override
    public String toString() {
        return "manager{" + "userName=" + userName + ", passWork=" + passWork + '}';
    }

}
