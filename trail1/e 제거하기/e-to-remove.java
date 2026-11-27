import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st = sc.next();
        
        for (int i  = 0; i < st.length(); i++) {
            if (st.charAt(i) == 'e') {
                st = st.substring(0,i) + st.substring(i+1);
                System.out.println(st);
                break;
            }
        }
    }
}