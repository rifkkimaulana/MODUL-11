
package rifkkimaulana;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rifki Maulana
 */

public class Barang {
    private Connection koneksi;

    public Barang() {
        koneksi = KoneksiDatabase.getKoneksi();
    }

    public void insert(String kd, String nm, int jml, long hrg){
        Statement statement = null;
        
        try {
            statement = koneksi.createStatement();

            System.out.println("Statement berhasil dibuat");
            String url= "INSERT INTO barang(kode_barang, nama_barang, jumlah,harga) VALUES('"+kd+"','"+nm+"',"+jml+","+hrg+")";

            statement.executeUpdate(url);
        } catch(SQLException ex) {
            System.out.println("Statement gagal dibuat");
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
    
    public void update(String kd, String nm, int jml, long hrg) {
        Statement statement = null;
        
        try {
            statement =koneksi.createStatement();
            System.out.println("Statement berhasil dibuat");
            String url="UPDATE barang SET nama_barang='"+nm+"',jumlah="+jml+",harga="+hrg+" WHERE kode_barang='"+kd+"'";
            
            statement.executeUpdate(url);
            
        } catch(SQLException ex) {
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
    
    public void delete(String kd) {
        Statement statement = null;
        try{
            statement = koneksi.createStatement();
            System.out.println("Statement berhasil dibuat");
            String url = "DELETE FROM barang WHERE kode_barang='"+kd+"'";
            statement.executeUpdate(url);
        } catch(SQLException ex) {
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
   

    
    
