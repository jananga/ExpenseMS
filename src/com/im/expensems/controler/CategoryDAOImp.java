/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.expensems.controler;

import com.im.db.DBConnectionFactory;
import com.im.expensems.model.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rpa29
 */
public class CategoryDAOImp implements CategoryDAO{

    @Override
    public boolean insertCatagory(Category category) 
    {
          //for check how many rows updated
          boolean ok = false;
          
          //Creating the query
          String query = "INSERT INTO `dbexpense`.`category` (`id`, `name`) VALUES ('?', '?');";
        try 
        {
            //Creating the Connection
            Connection con =  DBConnectionFactory.getConnection();

            //Create the prepared statement
            PreparedStatement ps = con.prepareStatement(query);

            //Setting the sequestial values
            ps.setInt(1, category.getId());
            ps.setString(2, category.getName());

            //Executing the prepared statement
            int res = ps.executeUpdate();

            //Check Insert Status
            if(res == 1)
            {
                ok = true;
            }
            else
            {
                ok = false;        
            }
            
        } catch (Exception ex) 
            {
                Logger.getLogger(CategoryDAOImp.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error: "+ex.getMessage());
            }
        finally
        {
            return ok;
        }
        
    }

    @Override
    public Category searchCategory(int id) {
        
        //Create Category Object to load a particular data row
        Category category = new Category();
         try {
             
          //Creating the query
          String query = "SELECT * FROM  `category` WHERE  `id` =?";
                    
          //Creating the Connection
          Connection con = DBConnectionFactory.getConnection();
            
          //Create the prepared statement
          PreparedStatement ps = con.prepareStatement(query);
          
          //Setting the sequestial values
          ps.setInt(1, id);
          
          //Executing the prepared statement
          ResultSet res = ps.executeQuery();
          
          //Fetching the records
          if(res.next())
          {
              //setting values
              category.setId(res.getInt("id"));
              category.setName(res.getString("name"));
          }
          else
          {
              JOptionPane.showMessageDialog(null, "No data found for Category Id: "+id);
          }
            
        } catch (Exception ex) {
            Logger.getLogger(CategoryDAOImp.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: "+ex.getMessage());
        } 
         finally
         {
             return category;
         }
        
        
    }

    @Override
    public boolean updateCategory(Category category) 
    {
        //check update status
        boolean ok = false;
        
        try {
            //create connection
            Connection con = DBConnectionFactory.getConnection();
            
            //create sql
            String query = "UPDATE  `dbexpense`.`category` SET  `name` =  '?' WHERE  `category`.`id` =?";
            
            //Create prepared statement
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, category.getName());
            ps.setInt(2, category.getId());
            
            //get number of values updated
            int rows = ps.executeUpdate();
            
            if(rows == 1)//one row updated
            {
                ok = true;
            }else//no rows updated or multiple rows updated
            {
                ok = false;
                JOptionPane.showMessageDialog(null, rows+" Updated.");
            }
    
        } catch (Exception ex) 
        {
            Logger.getLogger(CategoryDAOImp.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: "+ex.getMessage());
        }
        finally
        {
            return ok;
        }
    
    
    }

    @Override
    public List<Category> listAll() 
    {
        //Create Category Object List to load data 
        List<Category> list = new ArrayList<>();
        
         try {
             
          //Creating the query
          String query = "SELECT * FROM  `category`";
                    
          //Creating the Connection
          Connection con = DBConnectionFactory.getConnection();
            
          //Create the prepared statement
          PreparedStatement ps = con.prepareStatement(query);
                    
          //Executing the prepared statement
          ResultSet res = ps.executeQuery();
          
          //Fetching the records
          while(res.next())
          {
              //Create Category Objects
              Category cat = new Category();
              
              //setting values
              cat.setId(res.getInt("id"));
              cat.setName(res.getString("name"));
              list.add(cat);
          }
            
        } catch (Exception ex) {
            Logger.getLogger(CategoryDAOImp.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: "+ex.getMessage());
        } 
         finally
         {
             return list;
         }
    
    }

    @Override
    public boolean deleteCategory(int id) {
        //check update status
        boolean ok = false;
        
        //create Catagory object
        Category category = new Category();
        
        try {
            //create connection
            Connection con = DBConnectionFactory.getConnection();
            
            //create sql
            String query = "DELETE FROM `dbexpense`.`category` WHERE `category`.`id` = ?";
            
            //Create prepared statement
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, category.getId());
            
            //get number of values updated
            int rows = ps.executeUpdate();
            
            if(rows == 1)//one row deleted
            {
                ok = true;
            }else//no rows deleted or multiple rows deleted
            {
                ok = false;
                JOptionPane.showMessageDialog(null, rows+" deleted.");
            }
    
        } catch (Exception ex) 
        {
            Logger.getLogger(CategoryDAOImp.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: "+ex.getMessage());
        }
        finally
        {
            return ok;
        }  
    }
    
    
}
