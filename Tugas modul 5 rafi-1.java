package TugasRumah3;

import java.util.Scanner;

public class TemperaturSuhu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan suhu dalam derajat Celsius: ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.printf("Suhu dalam Fahrenheit: %.2f%n", fahrenheit);
        
        scanner.close();
    }
    
    // Fungsi untuk mengonversi suhu dari Celsius ke Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    
    }
}
