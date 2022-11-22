package rifkkimaulana;

import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rifki Maulana
 */

public class KoneksiDatabase {
    private static Connection koneksi;
    public static Connection getKoneksi() {
        if (koneksi == null) {
        try {
            String url = "jdbc:mysql://localhost:3306/db_oop";
            String user="root";
            String pass="";
            koneksi = DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi ke database berhasil");
            
        }
        catch(SQLException ex) {
            System.out.println("Koneksi ke database gagal");
            System.out.println("Pesan : " +ex.getMessage());
        }
    }
        return koneksi;
  }
}

