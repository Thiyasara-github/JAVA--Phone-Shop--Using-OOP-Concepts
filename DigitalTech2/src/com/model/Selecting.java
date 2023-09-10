/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

/**
 *
 * @author user
 */
public class Selecting {
    
    //private data members
    private int id;              //creating private variable for id
    private String username;     //creating private variable for username
    private String password;     //creating private variable for password
    private String option;       //creating private variable for option
    
    //public getter and setter methods
    //getter method for user ID
    public int getId(){
        return id;
    }
    
    //setter method for user ID
    public void setid(int id) {
        this.id = id;
    }
    
    //getter method for username
    public String getusername(){
        return username;
    }
    
    //setter method for username
    public void setusername(String username){
        this.username = username;
    }
    
    //getter method for user password
    public String getpassword(){
        return password;
    }
    
    //setter method for user password
    public void setpassword(String password){
        this.password = password;
    }
    
    //getter method for user type
    public String getoption(){
        return option;
    }
    
    //setter method for user type
    public void setoption(String option){
        this.option = option;
    }
    
}
