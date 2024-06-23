/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Asus
 */
public class customer {
    private String fullName;
    private long phoneNumber;
    private String Address;
    private String passWork;
           
    public customer() {
        
    }

    public customer(String fullName, long phoneNumber, String Address, String passWork) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.Address = Address;
        this.passWork = passWork;
    }   

    public String getFullName() {
        return fullName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public String getPassWork() {
        return passWork;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setPassWork(String passWork) {
        this.passWork = passWork;
    }

    @Override
    public String toString() {
        return "customer{" + "fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", Address=" + Address + ", passWork=" + passWork + '}';
    }
}
