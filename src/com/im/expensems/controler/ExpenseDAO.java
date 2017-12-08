/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.expensems.controler;

import com.im.expensems.model.Category;
import com.im.expensems.model.Expense;
import java.util.List;

/**
 *
 * @author rpa29
 */
public interface ExpenseDAO {
        //Insert Expense
    public boolean insertExpense(Expense expense);
    //Search particular Expense
    public Expense searchExpense(int id);
    //update particular Expense
    public boolean updateExpense(Expense expense);
    //Delete Expense
    public boolean  deleteExpense(int id);
    //List All Expense
    public List<Expense> listAll();
    //List All Expense
    public List<Category> fillCategory();
}
