import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        int sum = 0;
        String[] arr = new String[n];

        sc.nextLine();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        char check = sc.next().charAt(0);

        for (int i = 0; i < n; i++) {
            if(arr[i].charAt(0) == check) {
                cnt++;
                sum += arr[i].length();
            }
        }

        double avg = (double) sum / cnt;


        System.out.print(cnt + " ");
        System.out.printf("%.2f", avg);


    }
}