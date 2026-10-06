import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = n;

        for (int i = 1; i <= (2 * n - 1); i++) {
            for (int j = count; j > 0; j--) {
                System.out.print("* ");
            }

            System.out.println();

            if (i < n){
                count--;
            }else{
                count++;
            }
        }
    }
}