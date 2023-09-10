/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.model.Phone;
import com.model.Selecting;
import com.phoneDB.Phonedb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

//creating class for implements all the abstarct methods in PhoneAcs interface
public class PhoneAcsImp implements PhoneAcs {

    @Override
    public void add(Phone phones) {
       
        
        try {
            Connection con =  Phonedb.getConnection();        //calling getconnection method Phonedb class
            String sql = "INSERT INTO phones(pno,pname,brand,category,price) VALUES (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);  //creating preparedstatement, make an object as ps & call (sql) quary
            ps.setInt(1, phones.getPno());             //getting values through getter methods
            ps.setString(2, phones.getPname());        //getting values through getter methods
            ps.setString(3, phones.getBrand());        //getting values through getter methods
            ps.setString(4, phones.getCategory());     //getting values through getter methods
            ps.setInt(5, phones.getPrice());           //getting values through getter methods
            ps.executeUpdate();             //method to save data in the database
            
            JOptionPane.showMessageDialog(null, "Saved!"); //message dialog box
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");   //message dialog box
        }
        
        
    }
    
    @Override
    public void add2(Selecting selecting){
    
        try {
            Connection con =  Phonedb.getConnection();  //calling getconnection method Phonedb class
            String sql = "INSERT INTO selecting(id, username, password, option) VALUES (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, selecting.getId());
            ps.setString(2, selecting.getusername());
            ps.setString(3, selecting.getpassword());
            ps.setString(4, selecting.getoption());
            ps.executeUpdate();  //method to save data in the database
            
            JOptionPane.showMessageDialog(null, "Saved!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        
    }
    
    
    @Override
    public void update(Phone phones) {

        try {
           
            Connection con = Phonedb.getConnection();   //calling getconnection method Phonedb class
            String sql = "UPDATE phones SET pname=?,brand=?,category=?,price=? WHERE pno=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, phones.getPname());
            ps.setString(2, phones.getBrand());
            ps.setString(3, phones.getCategory());
            ps.setInt(4, phones.getPrice());
            ps.setInt(5, phones.getPno());
            ps.executeUpdate();  //method to save data in the database

        
            JOptionPane.showMessageDialog(null, "Updated!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
        

    }

    @Override
    public void delete(Phone phones) {

      try {
           
            Connection con = Phonedb.getConnection();   //calling getconnection method Phonedb class
            String sql = "delete from phones  WHERE pname=?";   //selecting the data in phones table where phone name
            PreparedStatement ps = con.prepareStatement(sql);   //creating preparedstatement 
            ps.setString(1, phones.getPname());
            ps.executeUpdate();   //method to save data in the database
            JOptionPane.showMessageDialog(null, "Deleted!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
        

    }

    @Override
    public Phone get1(String pname) {
        
        Phone p = new Phone();
        try {
            Connection con = Phonedb.getConnection();   //calling getconnection method Phonedb class
            String sql = "SELECT * FROM phones WHERE pname=?"; //selecting the data in phones table where phone name
            PreparedStatement ps = con.prepareStatement(sql);   //creating preparedstatement
            ps.setString(1, pname);
       
            ResultSet rs = ps.executeQuery();
            if(rs.next()){  //creating if function
                
                p.setPno(rs.getInt("pno"));                 //setting values through setter methods
                p.setPname(rs.getString("pname"));          //setting values through setter methods
                p.setBrand(rs.getString("brand"));          //setting values through setter methods
                p.setCategory(rs.getString("Category"));    //setting values through setter methods     
                p.setPrice(rs.getInt("price"));             //setting values through setter methods
 
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
        return p;

    }

    @Override
    public Phone get2(String brand){
        
        Phone p = new Phone();
        try {
            Connection con = Phonedb.getConnection();   //calling getconnection method Phonedb class
            String sql = "SELECT * FROM phones WHERE brand=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, brand);
       
            ResultSet rs = ps.executeQuery();   
            if(rs.next()){
                
                p.setPno(rs.getInt("pno"));
                p.setPname(rs.getString("pname"));
                p.setBrand(rs.getString("brand"));
                p.setCategory(rs.getString("Category"));
                p.setPrice(rs.getInt("price"));
 
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
        return p;
    }
    

    @Override
    public List<Phone> list() {         //all the methods created in phone class will be listed

         List<Phone> list = new ArrayList<>();
        try {
            Connection con = Phonedb.getConnection();   //calling getconnection method Phonedb class
            String sql = "SELECT * FROM phones ";
            PreparedStatement ps = con.prepareStatement(sql);   //creating prepare statement
            ResultSet rs = ps.executeQuery();
            
            
            
            while(rs.next()){
                Phone p = new Phone();                  //creating an object in Phone class
                p.setPno(rs.getInt("pno"));                 //setting values through setter methods
                p.setPname(rs.getString("pname"));          //setting values through setter methods
                p.setBrand(rs.getString("brand"));          //setting values through setter methods
                p.setCategory(rs.getString("Category"));    //setting values through setter methods
                p.setPrice(rs.getInt("Price"));             //setting values through setter methods
 
                list.add(p);    //using add method 
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
        return list;
  

    }
}

