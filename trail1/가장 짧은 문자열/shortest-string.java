import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();

        int min = Math.min(len1, Math.min(len2, len3));
        int max = Math.max(len1, Math.max(len2, len3));

        System.out.println(max - min);
    }
}