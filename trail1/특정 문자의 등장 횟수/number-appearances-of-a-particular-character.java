import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st = sc.next();
        int cntEe = 0;
        int cntEb = 0;
        
        for (int i  = 0; i < st.length() - 1; i++) {
            if (st.charAt(i) == 'e' && st.charAt(i + 1) == 'e') cntEe++;
            if (st.charAt(i) == 'e' && st.charAt(i + 1) == 'b') cntEb++;
        }

        System.out.println(cntEe + " " + cntEb);
    }
}