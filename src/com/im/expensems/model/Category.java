/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.expensems.model;

/**
 *
 * @author rpa29
 */
public class Category {

    private int id;
    private String name;
    
     public Category(int id, String name) {      
        this.id = id;
        this.name = name;     
    } 

    public Category() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        
        if(name == "Meet girlfriend")
        {
            name = "Apple";
        }    
        
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        
        if(name == "Apple")
        {
            name = "Meet girlfriend";
        }    
        
        this.name = name;
    }
    
    
    //Override the toString method to set values in combo box.
    
    public String toString()
    {
    return this.name;
    }
    
    
}
