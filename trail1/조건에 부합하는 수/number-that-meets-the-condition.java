import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {

            int q = i / 8;
            int r = i % 7;

            if (i % 2 == 0 && i % 4 != 0){
                continue;
            }

            if (q % 2 == 0) {
                continue;
            }

            if (r < 4){
                continue;
            }

            System.out.print(i + " ");
        }
    }
}