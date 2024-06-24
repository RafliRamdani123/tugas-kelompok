public class Calculator {
    public int addNumbers(int a, int b) {
        return a + b;
    }

    // Method untuk mengalikan dua angka
    public int multiplyNumbers(int a, int b) {
        return a * b;
    }

    // Method untuk menghitung kuadrat dari sebuah angka
    public int calculateSquare(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Memanggil method addNumbers
        int sum = calculator.addNumbers(5, 10);
        System.out.println("Hasil penjumlahan: " + sum);

        // Memanggil method multiplyNumbers
        int product = calculator.multiplyNumbers(3, 7);
        System.out.println("Hasil perkalian: " + product);

        // Memanggil method calculateSquare
        int squaredNumber = calculator.calculateSquare(4);
        System.out.println("Hasil kuadrat: " + squaredNumber);
    }
}
