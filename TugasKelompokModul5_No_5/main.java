package TugasRumah5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka bulat positif: ");
        int number = scanner.nextInt();
        
        printNumberPattern(number);
        
        scanner.close();
    }
    
    // Fungsi untuk mencetak pola angka dan bintang
    public static void printNumberPattern(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
