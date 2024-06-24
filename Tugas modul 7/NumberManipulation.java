public class NumberManipulation {
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method untuk mencetak kuadrat dari sebuah angka
    public void printSquare(int num) {
        int square = num * num;
        System.out.println("Kuadrat dari " + num + " adalah " + square);
    }

    public static void main(String[] args) {
        NumberManipulation manipulation = new NumberManipulation();

        // Memanggil method multiply
        int result = manipulation.multiply(5, 10);
        System.out.println("Hasil perkalian: " + result);

        // Memanggil method printSquare
        manipulation.printSquare(7);
    }
}
