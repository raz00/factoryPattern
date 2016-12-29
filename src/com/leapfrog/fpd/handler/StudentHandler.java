/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.fpd.handler;

import com.leapfrog.fpd.db.Database;
import com.leapfrog.fpd.db.Oracle;
import com.leapfrog.fpd.db.SqlServer;
import com.leapfrog.fpd.entity.Student;

/**
 *
 * @author Family
 */
public class StudentHandler {
    
    private Database db;
    
    public StudentHandler(Database db){
        this.db=db;
    }
    
    public void add(Student s){
        System.out.println("Add Invoked");
        db.open();
        db.execute(s.toString());
        db.close();
    }
     public void update(Student s){
        System.out.println("Update Invoked");
        db.open();
        db.execute(s.toString());
        db.close();
    }
    
    public void setDatabase(Database db){
        this.db=db;
    }  
}
