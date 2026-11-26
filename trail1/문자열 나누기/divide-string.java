import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();
        sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i  = 0; i < n; i++) {
            String st = sc.next();
            sb.append(st);
        }
        for (int i = 0; i < sb.length(); i++) {
            if (i != 0 && i % 5 == 0) {
                System.out.println();
            }

            System.out.print(sb.charAt(i));
        }
    }
}