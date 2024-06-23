/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Asus
 */
public class demo {
    private static String DB_URL = "jdbc:mysql://localhost:3306/ql_shop";
    private static String USER_NAME = "user";
    private static String PASSWORD = "123456";

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT NOW()");
            System.out.print(rs.toString());
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    // TẠO KẾT NỐI
    public static Connection getConnection(String dbURL, String userName, String password) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, userName, password);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }

    //ĐÓNG KẾT NỐI
    public static void closeConnection(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
