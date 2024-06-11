import java.util.Scanner;

public class CekHuruf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta pengguna memasukkan sebuah karakter
        System.out.print("Masukkan sebuah karakter: ");
        char karakter = scanner.next().charAt(0);
        
        // Memeriksa apakah karakter adalah huruf besar atau huruf kecil
        if (Character.isUpperCase(karakter)) {
            System.out.println("Karakter tersebut adalah huruf besar (kapital).");
        } else if (Character.isLowerCase(karakter)) {
            System.out.println("Karakter tersebut adalah huruf kecil.");
        } else {
            System.out.println("Karakter tersebut bukan huruf.");
        }
        
        // Menutup scanner
        scanner.close();
    }
}
