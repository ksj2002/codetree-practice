import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double ft = 9.2;
        double mi = 1.3;

        double cft = 30.48 * ft;
        double cmi = 160934 * mi;

        System.out.printf("%.1fft = %.1fcm\n", ft, cft);
        System.out.printf("%.1fmi = %.1fcm\n", mi, cmi);
    }
}