import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int dig1 = num / 100;
        int dig3 = num % 10;
        int dig2 = num % 100;
        dig2 /= 10;

        int sum = dig1 + dig2 + dig3;
        System.out.println(sum);
    }
}