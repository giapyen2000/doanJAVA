/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class DAO1 {
     private Connection cnn;
    
    public DAO1(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cnn = DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;databaseName=DOANQTCSDL_Quanlysinhvien ;"
                    + "username=sa;password=12345");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public boolean addKhoa(Khoa s){
        
        String sql = "INSERT INTO Khoa(Makhoa,Tenkhoa) "
                + "VALUES(?,?)";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
            ps.setString(1, s.getMakhoa());
            ps.setString(2, s.getTenkhoa());
            
            
            return ps.executeUpdate() > 0;
            
        } catch (SQLException e) {
        }
        
        return false;
    }
    
    /**
     *
     * @return
     */
    public ArrayList<Khoa> getListKhoa(){
        ArrayList<Khoa> list = new ArrayList<>();
        String sql = "SELECT * FROM Khoa";
        
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Khoa s = new Khoa();
                s.setMakhoa(rs.getString("Makhoa"));
                s.setTenkhoa(rs.getString("Tenkhoa"));
                
                
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
    public static void main(String[] args) {
        new DAO1();
    }

}
