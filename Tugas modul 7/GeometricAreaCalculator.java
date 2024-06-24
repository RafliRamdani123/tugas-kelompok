import java.util.Scanner;

public class GeometricAreaCalculator {
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method untuk menghitung luas segitiga
    public double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Method untuk menghitung luas persegi
    public double calculateArea(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        GeometricAreaCalculator calculator = new GeometricAreaCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih bentuk geometri untuk menghitung luas:");
        System.out.println("1. Lingkaran");
        System.out.println("2. Segitiga");
        System.out.println("3. Persegi");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double radius = scanner.nextDouble();
                double circleArea = calculator.calculateArea(radius);
                System.out.println("Luas lingkaran: " + circleArea);
                break;
            case 2:
                System.out.print("Masukkan alas segitiga: ");
                double base = scanner.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                double height = scanner.nextDouble();
                double triangleArea = calculator.calculateArea(base, height);
                System.out.println("Luas segitiga: " + triangleArea);
                break;
            case 3:
                System.out.print("Masukkan panjang sisi persegi: ");
                int side = scanner.nextInt();
                double squareArea = calculator.calculateArea(side);
                System.out.println("Luas persegi: " + squareArea);
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }

        scanner.close();
    }
}
