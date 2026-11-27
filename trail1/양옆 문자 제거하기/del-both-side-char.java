import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st = sc.next();
        char[] arr = st.toCharArray();
        
        for (int i  = 0; i < st.length(); i++) {
            if (i != 1 && i != (st.length() - 2)) {
                System.out.print(arr[i]);
            }
        }
    }
}