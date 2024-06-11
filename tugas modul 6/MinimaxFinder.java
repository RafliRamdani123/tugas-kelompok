import java.util.Scanner;

public class MinimaxFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta pengguna memasukkan jumlah angka yang akan dimasukkan
        System.out.print("Masukkan jumlah angka: ");
        int jumlahAngka = scanner.nextInt();
        
        // Membuat array untuk menyimpan angka-angka
        int[] angka = new int[jumlahAngka];
        
        // Meminta pengguna memasukkan angka-angka
        for (int i = 0; i < jumlahAngka; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = scanner.nextInt();
        }
        
        // Mencari nilai terkecil dan terbesar
        int nilaiTerkecil = angka[0];
        int nilaiTerbesar = angka[0];
        
        for (int i = 1; i < jumlahAngka; i++) {
            if (angka[i] < nilaiTerkecil) {
                nilaiTerkecil = angka[i];
            }
            if (angka[i] > nilaiTerbesar) {
                nilaiTerbesar = angka[i];
            }
        }
        
        // Menampilkan hasil
        System.out.println("Nilai terkecil: " + nilaiTerkecil);
        System.out.println("Nilai terbesar: " + nilaiTerbesar);
        
        // Menutup scanner
        scanner.close();
    }
}
