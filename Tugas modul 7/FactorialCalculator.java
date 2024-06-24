import java.util.Scanner;

public class FactorialCalculator {
    // Method untuk menghitung faktorial menggunakan rekursi
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat positif: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Bilangan yang dimasukkan harus positif.");
        } else {
            int result = factorial(number);
            System.out.println("Faktorial dari " + number + " adalah " + result);
        }

        scanner.close();
    }
}