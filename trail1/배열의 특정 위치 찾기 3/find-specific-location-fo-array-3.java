import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[99];
        int sum = 0;
        
        for (int i = 0; i < 99; i++) {
            arr[i] = sc.nextInt();
            
            if (arr[i] == 0) {
                sum = arr[i -3] + arr[i -2] + arr[i -1];
                System.out.println(sum);
                break;
            }
        }
    }
}