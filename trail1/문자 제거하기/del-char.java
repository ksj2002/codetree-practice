import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st = sc.next();

        while (true) {
            int deleteNum = sc.nextInt();

            if (deleteNum < st.length()) {
                st = st.substring(0, deleteNum) + st.substring(deleteNum + 1);
            }else {
                st = st.substring(0, st.length() - 1);
            }

            System.out.println(st);

            if (st.length() == 1) break;
        }
    }
}