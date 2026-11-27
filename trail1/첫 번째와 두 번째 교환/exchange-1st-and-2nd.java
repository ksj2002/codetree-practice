import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st = sc.next();
        char[] arr = st.toCharArray();

        char a = arr[0];
        char b = arr[1];
        
        for (int i = 0; i < st.length(); i++) {
            if (arr[i] == a) {
                arr[i] = b;
            }else if(arr[i] == b) {
                arr[i] = a;
            }
        }

        System.out.println(arr);
    }
}

