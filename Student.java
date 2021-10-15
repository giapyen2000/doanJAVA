/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien;
import java.io.Serializable;
import java.util.Date;
/**
 *
 * @author Admin
 */
class Student implements Serializable {
      private String MSV, TenSV, Gioitinh,Malop,Makhoa,Quequan;

    private Date Ngaysinh;// dd/mm/yyyy

    public String getMSV() {
        return MSV;
    }

    public void setMSV(String MSV) {
        this.MSV = MSV;
    }

    public String getTenSV() {
        return TenSV;
    }

    public void setTenSV(String TenSV) {
        this.TenSV = TenSV;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public String getMalop() {
        return Malop;
    }

    public void setMalop(String Malop) {
        this.Malop = Malop;
    }

    public String getMakhoa() {
        return Makhoa;
    }

    public void setMakhoa(String Makhoa) {
        this.Makhoa= Makhoa;
    }

    public String getQuequan() {
        return Quequan;
    }

    public void setQuequan(String Quequan) {
        this.Quequan = Quequan;
    }

    public Date getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(Date Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    String getTenkhoa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}

    

