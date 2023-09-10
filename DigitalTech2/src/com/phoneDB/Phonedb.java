/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phoneDB;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author user
 */
public class Phonedb {
    
    //static data members
    static Connection con;
    static String driver = "com.mysql.cj.jdbc.Driver";
    static String url = "jdbc:mysql://localhost/digitaltech";
    static String uname = "root";
    static String pass = "";
    
    //getter method for the connection
    public static Connection getConnection() throws Exception{
        
        if (con==null){
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url,uname,pass);  
        }
        return con;
    }
}
