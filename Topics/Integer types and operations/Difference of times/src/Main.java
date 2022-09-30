import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int firstHours = scanner.nextInt();
        int firstMinutes = scanner.nextInt();
        int firstSeconds  = scanner.nextInt();

        int secondHours = scanner.nextInt();
        int secondMinutes = scanner.nextInt();
        int secondSeconds = scanner.nextInt();

        int resultHours = secondHours - firstHours;
        int resultMinutes = secondMinutes - firstMinutes;
        int resultSeconds = secondSeconds - firstSeconds;

        int result  = (resultHours * 3600) + (resultMinutes * 60) + resultSeconds;

        System.out.println(result);


    }
}