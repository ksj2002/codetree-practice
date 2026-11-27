import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String shiftOdr = sc.next();
        int l = a.length();
        
        for (int i  = 0; i < shiftOdr.length(); i++) {
            if (shiftOdr.charAt(i) == 'L') {
                a = a.substring(1, l) + a.charAt(0);
            } else if (shiftOdr.charAt(i) == 'R') {
                a = a.charAt(l - 1) + a.substring(0, l - 1);
            }
        }

         System.out.println(a);
    }
}