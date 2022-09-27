import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        int int3 = scanner.nextInt();

        boolean sum20 = ((int1 + int2 == 20 || int1 + int3 == 20 ) || (int3 + int2 == 20));

        if (sum20){
            System.out.println("true");
        }else

    {
        System.out.println("false");
    }


}}