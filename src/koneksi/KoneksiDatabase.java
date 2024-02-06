/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

/**
 *
 * @author asus
 */

import java.sql.*;
import javax.swing.JOptionPane;
public class KoneksiDatabase {
    private static Connection koneksi;
    
    public static Connection bukaKoneksi()
    {
        String db = "jdbc:mysql://localhost:3306/db_nasabah";
        String user = "root";
        String pass = "";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(db, user, pass);
            return koneksi;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
