import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        String input;

        input = scanner.next();

        switch (input) {
            case "one" -> System.out.println(1);
            case "two" -> System.out.println(2);
            case "three" -> System.out.println(3);
            case "four" -> System.out.println(4);
            case "five" -> System.out.println(5);
            case "six" -> System.out.println(6);
            case "seven" -> System.out.println(7);
            case "eight" -> System.out.println(8);
            case "nine" -> System.out.println(9);
        }
    }
}