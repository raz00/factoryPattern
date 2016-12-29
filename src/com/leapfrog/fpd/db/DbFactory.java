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
public class DbFactory {
    
    public static Database get(String key){
        if(key.equalsIgnoreCase("mysql")){
            return new MySql();
        }
        else  if(key.equalsIgnoreCase("mongodb")){
            return new MongoDB();
        }
        else  if(key.equalsIgnoreCase("sqlserver")){
            return new SqlServer();
        }
        else  if(key.equalsIgnoreCase("oracle")){
            return new Oracle();
        }
        else  if(key.equalsIgnoreCase("sqlite")){
            return new Sqlite();
        }
        return null;
    }
}
