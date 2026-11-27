import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st = sc.next();

        char arr[] = st.toCharArray();
        
        arr[1] = 'a';
        arr[st.length() - 2] = 'a';

        System.out.println(arr);
    }
}