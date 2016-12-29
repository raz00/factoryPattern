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
public class MongoDB  extends Database{

    @Override
    public void open() {
        System.out.println("MongoDB is open.");
    }

    @Override
    public void execute(String sql) {
        System.out.println("Executing " + sql);
    }

    @Override
    public void close() {
        System.out.println("MongoDB is close.");
    }
    
}
