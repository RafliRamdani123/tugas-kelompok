package TugasNo4;

public class SegitigaTerbalik {
    public static void main(String[] args) {
        int tinggi = 5; // Tinggi segitiga
        
        // Looping untuk baris
        for (int i = tinggi; i >= 1; i--) {
            // Looping untuk kolom
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" "); // Mencetak spasi
            }
            // Looping untuk mencetak bintang
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*"); // Mencetak bintang
            }
            // Pindah ke baris baru setelah selesai mencetak satu baris
            System.out.println();
        }
    }
}
