/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.controller;

import com.model.Phone;
import com.model.Selecting;
import java.util.List;

//creating jva interface
public interface PhoneAcs {
    
    public void add(Phone phones);          //method to add data in mobile view
    public void add2(Selecting selecting);  //method to add data in manger page
    public void update(Phone phones);       //method toupdate data
    public void delete(Phone phones);       //method to delete data
    public Phone get1(String pname);        //method to search data by phone name
    public Phone get2(String brand);        //method to search data by phone brand
    public List<Phone>list();               //method to list data
}
