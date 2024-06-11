import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TanggalWaktu {
     public static void main(String[] args) {
        // Mendapatkan tanggal dan waktu saat ini
        LocalDateTime sekarang = LocalDateTime.now();
        
        // Menentukan format tanggal dan waktu
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        
        // Menampilkan tanggal dan waktu saat ini
        String sekarangStr = sekarang.format(format);
        System.out.println("Tanggal dan waktu saat ini: " + sekarangStr);
        
        // Menghitung tanggal dan waktu setelah 100 hari dari saat ini
        LocalDateTime seratusHariKemudian = sekarang.plusDays(100);
        String seratusHariKemudianStr = seratusHariKemudian.format(format);
        
        // Menampilkan tanggal dan waktu setelah 100 hari
        System.out.println("Tanggal dan waktu setelah 100 hari: " + seratusHariKemudianStr);
    }
}
