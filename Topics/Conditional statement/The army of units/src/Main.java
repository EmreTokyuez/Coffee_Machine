import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
         String result;
        if (size < 1){
            result = "no army";
        }
        else if(size >= 1 && size <= 19){
            result = "pack";
        }
        else if(size >= 20 && size <= 249){
            result = "throng";
        }

        else if(size >= 250 && size <= 999){
            result = "zounds";
        }
        else{
            result = "legion";

        }

        System.out.println(result);
    }
}