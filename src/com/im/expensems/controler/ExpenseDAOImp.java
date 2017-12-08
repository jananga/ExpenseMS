/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.expensems.controler;

import com.im.db.DBConnectionFactory;
import com.im.expensems.model.Category;
import com.im.expensems.model.Expense;
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
public class ExpenseDAOImp implements ExpenseDAO{

    
    @Override
    public boolean insertExpense(Expense expense) {
      //for check how many rows updated
          boolean ok = false;
          
          //Creating the query
          String query = "INSERT INTO  `dbexpense`.`expences` (`id` ,`description` ,`amount` ,`date` ,`category`)VALUES (NULL , ?, ?, ?, ?)";
          //JOptionPane.showMessageDialog(null, "query: "+query);
        try 
        {
            //Creating the Connection
            Connection con =  DBConnectionFactory.getConnection();

            //Create the prepared statement
            PreparedStatement ps = con.prepareStatement(query);
            
            //JOptionPane.showMessageDialog(null, "query: "+category.getName().toString());
            //'2017-12-22'
            //Setting the sequestial values
            ps.setString(1, expense.getDescription().toString());
            ps.setDouble(2, Double.valueOf(expense.getAmount()));
            ps.setString(3, expense.getDate().toString());
            ps.setString(4, expense.getCategory().toString());

            
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
    public Expense searchExpense(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateExpense(Expense expence) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteExpense(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Expense> listAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Category> fillCategory() {
     
        List<Category> list = new ArrayList<Category>();
        
        try{
            
            String sql = "SELECT * FROM  `category`";
            Connection con = DBConnectionFactory.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet res = pst.executeQuery();
             
            //Fetching the Catagory results
            while(res.next()){

              //Add category to List
              list.add(new Category(res.getInt("id"),res.getString("name")));
                
            }
        }
        
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
    }
     finally
        {   
                   return list;
        } 
    }
    
}
