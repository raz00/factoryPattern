/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.fpd;
import com.leapfrog.fpd.db.Database;
import com.leapfrog.fpd.db.DbFactory;
import com.leapfrog.fpd.db.MongoDB;
import com.leapfrog.fpd.db.MySql;
import com.leapfrog.fpd.db.Oracle;
import com.leapfrog.fpd.db.Sqlite;
import com.leapfrog.fpd.entity.Student;
import com.leapfrog.fpd.handler.StudentHandler;


/**
 *
 * @author Family
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        Student std=new Student(0, "Siddhant", "BC");
        StudentHandler stdHandler=new StudentHandler(new Oracle());
        stdHandler.add(std);
        std.setId(2);
        stdHandler.update(std);
        
        stdHandler.setDatabase(new MySql());
        
        stdHandler.update(std);
        
         stdHandler.setDatabase(new Sqlite());
        
        stdHandler.add(std);
        
        
    }
    
}
