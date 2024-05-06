package TugasRumah4;

import java.util.Scanner;

public class VokalKounter {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah kata atau kalimat: ");
        String input = scanner.nextLine();
        
        int vowelCount = countVowels(input);
        System.out.println("Jumlah huruf vokal: " + vowelCount);
        
        scanner.close();
    }
    
    // Fungsi untuk menghitung jumlah huruf vokal dalam sebuah string
    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
