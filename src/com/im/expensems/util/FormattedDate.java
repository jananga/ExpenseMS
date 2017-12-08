/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.expensems.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author rpa29
 */
public class FormattedDate {
    
    public String formatDate(Date date)
    {
    SimpleDateFormat dt1 = new SimpleDateFormat("yyyyy-mm-dd");
    return dt1.format(date);
    
    }
    
}
