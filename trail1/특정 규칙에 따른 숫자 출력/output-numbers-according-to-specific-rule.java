import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 1;

        for (int i = 0; i < n; i++) {
            for (int j = n; j > n - i; j--) {
                System.out.print("  ");
            }

            for (int k = n - i; k > 0; k--){
                System.out.print(cnt + " ");
                
                if (cnt < 9){
                    cnt++;
                }else {
                    cnt = 1;
                }
            }
            System.out.println();
        }
    }
}