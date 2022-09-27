import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user = scanner.next();
        String firstchar = String.valueOf(user.charAt(0));
        System.out.println(firstchar.equalsIgnoreCase("J"));
    }
}