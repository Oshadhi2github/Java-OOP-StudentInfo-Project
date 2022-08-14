/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPStudentdb;

import java.sql.Connection;
import java.sql.DriverManager;


public class StudentDb {
    static Connection con;
    static String driver = "com.mysql.jdbc.Driver";
    static String Url = "jdbc:mysql://localhost/StudentInfo";
    static String uname = "root";
    static String pass = "";
    
    public static Connection getConnection()throws Exception{
        if(con == null){
            Class.forName(driver);
            con = DriverManager.getConnection(Url, uname, pass);
        }
        return con;
    }
}
