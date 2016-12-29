/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.fpd.db;

/**
 *
 * @author Family
 */
public interface Database {
    
   
    
   void open();
    
    void execute(String sql);
    
     void close();
    
    
    
}
