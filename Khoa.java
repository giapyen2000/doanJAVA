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
public class Khoa implements Serializable {
    
/**
 *
 * @author Admin
 */

      private String Makhoa, Tenkhoa;

   
    public String getMakhoa() {
        return Makhoa;
    }

    public void setMakhoa(String Makhoa) {
        this.Makhoa = Makhoa;
    }

    public String getTenkhoa() {
        return Tenkhoa;
    }

    public void setTenkhoa(String Tenkhoa) {
        this.Tenkhoa = Tenkhoa;
    }

}

    

    
    