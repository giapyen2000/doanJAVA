/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Admin
 */
public class DBConnect {
    
    public Connection getDBConnect(){
        Connection cnn=null;
        try{
            String uRL="jdbc:sqlserver://127.0.0.1:1433;databaseName=DOANQTCSDL_Quanlysinhvien";
            String user ="sa";
            String pass = "12345";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cnn = DriverManager.getConnection(uRL, user, pass);
             System.out.println("Thanh cong");
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Khong ket noi duoc");
        }
        return cnn;
    }

   
    
    
}
