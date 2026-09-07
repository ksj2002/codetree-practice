import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int h = sc.nextInt();
         int v = sc.nextInt();
         
         h += 8;
         v *= 3;

        System.out.println(h);
        System.out.println(v);
        System.out.println(h * v);



    }
}
