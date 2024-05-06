package TugasRumah1;

import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println("Bilangan tersebut adalah bilangan prima");
        } else {
            System.out.println("Bilangan tersebut bukan bilangan prima");
        }

        scanner.close();
    }

    // Fungsi untuk memeriksa apakah sebuah bilangan adalah bilangan prima
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
