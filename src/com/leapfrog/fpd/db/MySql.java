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
public class MySql implements Database{

    @Override
    public void open() {
        System.out.println("Myql is open");
    }

    @Override
    public void execute(String sql) {
        System.out.println("Executing " + sql);
    }

    @Override
    public void close() {
        System.out.println("Mysql is closing");
    }

    
    
}
