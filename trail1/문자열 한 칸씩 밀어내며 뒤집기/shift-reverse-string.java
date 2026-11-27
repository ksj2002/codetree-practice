import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st = sc.next();
        int q = sc.nextInt();
        int l = st.length();

        for (int i = 0; i < q; i++) {
            int menu = sc.nextInt();

            if (menu == 1) {
                st = st.substring(1,l) + st.charAt(0);
            }else if (menu == 2) {
                st = st.charAt(l -1) + st.substring(0,l - 1);
            }else {
                st = new StringBuilder(st).reverse().toString();
            }

            System.out.println(st);
        }
    }
}