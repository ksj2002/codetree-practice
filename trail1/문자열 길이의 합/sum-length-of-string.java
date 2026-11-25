import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int lengthSum = 0;
        int cnt = 0;
        String[] arr = new String[n];

        sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
            lengthSum += arr[i].length();

            if (arr[i].charAt(0) == 'a') cnt++;
        }

        System.out.println(lengthSum + " " + cnt);
    }
}