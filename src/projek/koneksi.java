/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projek;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class koneksi {
    private static Connection mysqlkonek;
    public static Connection koneksiDB()throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3306/db_mahasiswa"; //url database
            String user="root"; //user database
            String pass=""; //password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlkonek=(Connection)DriverManager.getConnection(url, user, pass);            
        } catch (Exception e){
            System.err.println("koneksi gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
        }
        return mysqlkonek;
    }    
}
