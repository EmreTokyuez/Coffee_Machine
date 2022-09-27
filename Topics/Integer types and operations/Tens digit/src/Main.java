import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        int hund = in % 100;
        int ten = hund / 10;
        System.out.println(ten);
    }
}