/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.fpd.database;

/**
 *
 * @author Raju
 */
public class Sqlite extends Database{
    public void open(){
        System.out.println("Sqlite is open.");
    }
    public void execute(String sql){
        System.out.println("Executing" + sql);
       
    }
    public void close(){
        System.out.println("Sqlite is close.");
    }
}
