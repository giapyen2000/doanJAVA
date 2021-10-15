/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien;
import java.sql.*;
import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class QuanlySinhvien {

    /**
     * @param args the command line arguments
     */
    static DBConnect kn=new DBConnect();
    public static void main(String[] args) {
         {
        FormLogin LG = new FormLogin ();
//        ChiTiet chiTiet = new ChiTiet();
        LG.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LG.setVisible(true);
        
    }

        Connection cn=kn.getDBConnect();
        Statement stm=null;
        ResultSet rs=null;
         String sql="select*from Khoa";
        try{
           stm=cn.createStatement();
           rs=stm.executeQuery(sql);
           while(rs.next()){
               System.out.println("Makhoa: "+rs.getString(1)+"\tTenkhoa: "+rs.getString(2));
           }
            
        }catch (Exception e){
            System.out.println("Loi gi do roi"+e);
    }
    
}
}