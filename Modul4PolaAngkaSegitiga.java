package TugasNo4;

public class PolaAngkaSegitiga {
    public static void main(String[] args) {
        int tinggi = 5; // Tinggi segitiga
        
        // Looping untuk baris
        for (int i = 1; i <= tinggi; i++) {
            // Looping untuk kolom
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " "); // Mencetak angka
            }
            // Pindah ke baris baru setelah selesai mencetak satu baris
            System.out.println();
        }
    }
}
