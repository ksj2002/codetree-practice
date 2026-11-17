import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int Max_Value = Integer.MAX_VALUE;
        final int Min_Value = Integer.MIN_VALUE;

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int num = 1;
        
        for (int i  = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = num + n * j;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
            num++;
        }
        
    }
}