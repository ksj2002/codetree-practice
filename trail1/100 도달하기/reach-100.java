import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = sc.nextInt();
        int num = 0;
        

        for (int i = 2; i < 20; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            
            num++;
            
            if (arr[i] > 100) {
                break;
            }
        }
        
        for (int i = 0; i < num + 2; i++) {
            System.out.print(arr[i] + " ");
        }
        
        
    }
}