import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int start = scanner.nextInt();
        int max = scanner.nextInt();
        String out;
        for (; start <= max; start++) {
            out = "";

            if (start % 3 == 0) {
                out += "Fizz";
            }
            if (start % 5 == 0) {
                out += "Buzz";

            }
            if (start % 5 != 0 && start % 3 != 0)
                out = String.valueOf(start);
            System.out.println(out);

        }


    }
    }
