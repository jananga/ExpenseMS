/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.expensems.controler;

import com.im.expensems.model.Category;
import java.util.List;



/**
 *
 * @author rpa29
 */
public interface CategoryDAO {
    
    //Insert Catagory
    public boolean insertCatagory(Category category);
    //Search particular Category
    public Category searchCategory(int id);
    //update particular category
    public boolean updateCategory(Category category);
    //Delete Catagory
    public boolean  deleteCategory(int id);
    //List All Categories
    public List<Category> listAll();
    
}
