import java.util.Scanner;

public class PalindomCheker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta pengguna memasukkan sebuah kalimat atau kata
        System.out.print("Masukkan sebuah kalimat atau kata: ");
        String input = scanner.nextLine();
        
        // Menghapus semua spasi dan tanda baca, serta mengubah menjadi huruf kecil
        String cleanedInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        
        // Memeriksa apakah kalimat atau kata tersebut adalah palindrom
        if (isPalindrom(cleanedInput)) {
            System.out.println("Kalimat atau kata tersebut adalah palindrom.");
        } else {
            System.out.println("Kalimat atau kata tersebut bukan palindrom.");
        }
        
        // Menutup scanner
        scanner.close();
    }
    
    // Metode untuk memeriksa apakah sebuah string adalah palindrom
    private static boolean isPalindrom(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }      
        return true;
    }
}
