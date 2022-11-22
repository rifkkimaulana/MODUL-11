
package rifkkimaulana;

/**
 *
 * @author Rifki Maulana
 */

public class ProgramInjection {

    public static void main(String[] args) {
       Barang barang = new Barang();
           String kd = "B001' OR 'rifkkimaulana' = 'rifkkimaulana";
           barang.delete(kd);
           String sql = "DELETE FROM barang WHERE kode_barang='"+kd+"'"; 
           System.out.println(sql);
       }
    }


