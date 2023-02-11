/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.config;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author dani
 */
public class Config {
    
    private static String JDBC_DB = "jdbc:mysql://localhost:3306/dbconvertercurrency";
    private static String USERNAME = "root";
    private static String PASSWORD = "";
    private static Connection conn;
    
    public static void Connection() {
        try {
            conn = DriverManager.getConnection(JDBC_DB, USERNAME, PASSWORD);
            System.out.println("BERHASIL KONEKSI");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
}
