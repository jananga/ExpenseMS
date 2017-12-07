/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author rpa29
 */
public class DBConnectionFactory {
    
    
    //Connection details
    static Connection connection = null;
    static String userName = "root";
    static String passWord = "";
    static String driverName ="com.mysql.jdbc.Driver";
    static String dbUrl = "jdbc:mysql://localhost:3306/dbexpense";
    
    
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException
    {
        //Check Connection
        if(connection == null)
        {
            //If connection not created
            Class.forName(driverName);
            connection = DriverManager.getConnection(dbUrl, userName, passWord);
                return connection;

        }else{
            //If connection already created
         return connection;
        }
    
    }  
    
}
