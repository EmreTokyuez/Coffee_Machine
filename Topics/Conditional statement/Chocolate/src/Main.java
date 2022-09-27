import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();
        String result = "";

        boolean a = (K > N * M);
        boolean b = K == N;
        boolean c = K == M;
        boolean d = (K % N) <= M;
        boolean e = (K % M) <= N;


        if(a){
            result = "NO";
        }
        if (b || c){
            result = "YES";
        }
        if (d || e){
            result = "YES";
        }

        if (!a && !b && !c && !d && !e){
            result = "NO";
        }

        System.out.println(result);
    }

}