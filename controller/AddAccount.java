/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.util.ArrayList;
import model.customer;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Asus
 */
public class AddAccount {

    private Connection conn;

    public AddAccount() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ql_shop", "user", "123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean addAccount(customer s) {

        String sql = "INSERT INTO customer_table(FULLNAME,PHONENUMBER,ADDRESS,PASSWORK) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getFullName());
            ps.setLong(2, s.getPhoneNumber());
            ps.setString(3, s.getAddress());
            ps.setString(4, s.getPassWork());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public ArrayList<customer> getListAccont() {
        ArrayList<customer> list = new ArrayList<>();
        String sql = "SELECT * FROM customer_table";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                customer s = new customer();
                s.setFullName(rs.getString("FULLNAME"));
                s.setPhoneNumber(rs.getLong("PHONENUMBER"));
                s.setAddress(rs.getString("ADDRESS"));
                s.setPassWork(rs.getString("PASSWORK"));

                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public static void main(String[] args) {
        new AddAccount();
    }
}
