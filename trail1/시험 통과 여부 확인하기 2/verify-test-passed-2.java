import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][4];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            int avg = 0;
            
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
                
                sum += arr[i][j];
                
            }
            
            avg = sum / 4;
            
            
            if (avg >= 60) {
                System.out.println("pass");
                cnt++;
            }else {
                System.out.println("fail");
            }
        }

        System.out.println(cnt);
    }
}