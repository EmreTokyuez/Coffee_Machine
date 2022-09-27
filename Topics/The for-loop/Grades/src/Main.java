import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int gradeD = 0;
        int gradeB = 0;
        int gradeA = 0;
        int gradeC = 0;
        int lines = Integer.parseInt(scanner.next());
        String in = "";
        int i;
        for (i = 0; i <= lines; i++) {
            in = scanner.nextLine();
            switch (in) {
                case "A" -> gradeA += 1;
                case "B" -> gradeB += 1;
                case "C" -> gradeC += 1;
                case "D" -> gradeD += 1;
            }
        }
        System.out.println(gradeD + " " + gradeC + " " + gradeB + " " + gradeA);

    }
}