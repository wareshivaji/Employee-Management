package com.Prac6.empapp;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    static Connection con;
    public static Connection createDBConnection(){
        //load driver
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //get connection
            String url= "jdbc:mysql://localhost:3306/employeeDB?useSSL=true&requireSSL=false";
            String username="root";
            String password="root";
            con = DriverManager.getConnection(url,username,password);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        //get connection
        return con;
    }
}
