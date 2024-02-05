import java.util.*;

public class Digits {

    static int digit(int n) {
        if (n == 0) {
            return 0;
        }
        // int p = p + digit(n / 10);
        return 1 + digit(n / 10);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit ");
        int n = sc.nextInt();
        int ans = digit(n);
        System.out.println("Digits are " + ans);
        sc.close();
    }

}
