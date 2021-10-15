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
public class DAO {
    private Connection cnn;
    
    public DAO(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cnn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=DOANQTCSDL_Quanlysinhvien;"
                    + "username=sa;password=12345");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public boolean addSinhvien(Student s){
        
        String sql = "INSERT INTO Sinhvien(MSV,TenSV,Ngaysinh,Gioitinh, Malop, Makhoa, Quequan) "
                + "VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
            ps.setString(1, s.getMSV());
            ps.setString(2, s.getTenSV());
            ps.setDate(3, new Date(s.getNgaysinh().getTime()));
            ps.setString(4, s.getGioitinh());
            ps.setString(5, s.getMalop());
            ps.setString(6, s.getMakhoa());
            ps.setString(7, s.getQuequan());
            
            return ps.executeUpdate() > 0;
            
        } catch (SQLException e) {
        }
        
        return false;
    }
    
    /**
     *
     * @return
     */
    public ArrayList<Student> getListStudent(){
        ArrayList<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM Sinhvien";
        
        try {
            PreparedStatement ps = cnn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Student s = new Student();
                s.setMSV(rs.getString("MSV"));
                s.setTenSV(rs.getString("TenSV"));
                s.setNgaysinh(rs.getDate("Ngaysinh"));
                s.setGioitinh(rs.getString("Gioitinh"));
                s.setMalop(rs.getString("Malop"));
                s.setMakhoa(rs.getString("Makhoa"));
                s.setQuequan(rs.getString("Quequan"));
                
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
    public static void main(String[] args) {
        new DAO();
    }

    boolean addStudent(Student s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

