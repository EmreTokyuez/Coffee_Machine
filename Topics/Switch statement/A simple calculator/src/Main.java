import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        long num1 = scanner.nextLong();
        String op = scanner.next();
        long num2 = scanner.nextLong();



        switch(op) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;

            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(num1 / num2);
                }
                break;
            default:
                System.out.println("Unknown operator");

        }
    }
}