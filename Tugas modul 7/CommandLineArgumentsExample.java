public class CommandLineArgumentsExample {
    public void printArguments(String[] args) {
        if (args.length > 0) {
            System.out.println("Argumen yang diberikan:");
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("Tidak ada argumen yang diberikan.");
        }
    }

    public static void main(String[] args) {
        CommandLineArgumentsExample example = new CommandLineArgumentsExample();

        // Memanggil method printArguments dengan argumen baris perintah
        example.printArguments(args);
    }
}
