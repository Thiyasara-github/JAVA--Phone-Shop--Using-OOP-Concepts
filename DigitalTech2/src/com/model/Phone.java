/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

/**
 *
 * @author user
 */
public class Phone {
    
    //private data members
    private int pno;            //creating private variable for pno 
    private String pname;       //creating private variable for pname
    private String brand;       //creating private variable for brand
    private String category;    //creating private variable for category
    private int price;          //creating private variable for price
     
    //public getter and setter methods
    //getter method for phone number
    public int getPno() {               
        return pno;
    }

    //setter method for phone number
    public void setPno(int pno) {
        this.pno = pno;
    }

    //getter method for phone name
    public String getPname() {
        return pname;
    }

    //setter method for phone name
    public void setPname(String pname) {
        this.pname = pname;
    }

    //getter method for phone brand
    public String getBrand() {
        return brand;
    }
 
    //setter method for phone brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    //getter method for category
    public String getCategory() {
        return category;
    }

    //setter method for category
    public void setCategory(String category) {
        this.category = category;
    }

    //getter method for price
    public int getPrice() {
        return price;
    }

    //setter method for price
    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
            