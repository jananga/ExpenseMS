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
import java.sql.SQLException;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateCategory(Category category) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Category> listAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
