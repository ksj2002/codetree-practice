import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();
        int n  = sc.nextInt();

        if (n < st.length()) {
            for (int i = (st.length() - 1); i >= (st.length() - n); i--) {
                System.out.print(st.charAt(i));
            }
        }else {
            for(int i  = (st.length() - 1); i >= 0; i--) {
                System.out.print(st.charAt(i));
            }
        }
    }
}