import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int dis = 0;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            
        }

        for (int i = 1; i < n; i++) {
            dis = arr[i] - arr[i -1];
            
            if (dis < min) {
                min = dis;
            }
        }

        System.out.println(min);
        
        
    }
}