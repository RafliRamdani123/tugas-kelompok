package TugasNo3;

import java.util.Scanner;

public class LoopDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int jumlahPositif = 0;
        int bilangan;
        
        do {
            System.out.print("Masukkan bilangan (masukkan negatif untuk berhenti): ");
            bilangan = scanner.nextInt();
            
            if (bilangan >= 0) {
                jumlahPositif += bilangan;
            }
        } while (bilangan >= 0);
        
        System.out.println("Jumlah bilangan positif yang dimasukkan: " + jumlahPositif);
        
        scanner.close();
    }
    
}
