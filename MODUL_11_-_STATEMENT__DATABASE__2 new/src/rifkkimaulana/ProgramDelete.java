/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rifkkimaulana;

//import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rifki Maulana
 */

public class ProgramDelete {

    public static void main(String[] args) {
        Connection koneksi = KoneksiDatabase.getKoneksi();
        Statement statement = null;
        try {
            statement =koneksi.createStatement();
            System.out.println("Statement behasil dibuat");
            String url= "DELETE FROM barang WHERE kode_barang='B001'";
            statement.executeUpdate(url);
    }
        catch(SQLException ex) {
            System.out.println("Koneksi ke database gagal");
            System.out.println("Pesan : " +ex.getMessage());
        } finally {
            if(statement != null){
                try{
                    statement.close();
                    System.out.println("Statement berhasil ditutup");
                } catch(SQLException ex) {
                    System.out.println("Statement gagal ditutup");
                    System.out.println("Pesan : " + ex.getMessage());
                }
            }
        }
    }
    
}

