import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        int cnt = 1;

        for (int i = 1; i < st.length(); i++) {
            if (st.charAt(i - 1) == st.charAt(i)){
                cnt++;
            }else {
                sb.append(st.charAt(i -1));
                sb.append(cnt);
                cnt = 1;
            }
        }
        
        sb.append(st.charAt(st.length() - 1));
        sb.append(cnt);

        System.out.println(sb.length());
        System.out.println(sb);
    }
}