import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();
        int l = st.length();

        System.out.println(st);

        for (int i  = 0; i < l; i++) {
            st = st.charAt(l - 1) + st.substring(0, l -1);
            System.out.println(st);
        }
    }
}