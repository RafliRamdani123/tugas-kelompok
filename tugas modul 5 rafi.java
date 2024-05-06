package TugasRumah2;

import java.util.Scanner;

public class NamaBulan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka bulan (1-12): ");
        int monthNumber = scanner.nextInt();
        
        String monthName = getMonthName(monthNumber);
        if (monthName != null) {
            System.out.println("Nama bulan: " + monthName);
        } else {
            System.out.println("Angka bulan tidak valid");
        }
        
        scanner.close();
    }
    
    // Fungsi untuk mendapatkan nama bulan berdasarkan angka bulan
    public static String getMonthName(int monthNumber) {
        switch (monthNumber) {
            case 1: return "Januari";
            case 2: return "Februari";
            case 3: return "Maret";
            case 4: return "April";
            case 5: return "Mei";
            case 6: return "Juni";
            case 7: return "Juli";
            case 8: return "Agustus";
            case 9: return "September";
            case 10: return "Oktober";
            case 11: return "November";
            case 12: return "Desember";
            default: return null;
        }
    }
}
