import java.util.*;

public class SumOfDigit {
    static int add(int[] a, int i) {
        if (i == a.length - 1) {
            return a[i];

        }
        int p = a[i];
        return p + add(a, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of element in array  ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elemnts ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("SUM IS " + add(a, 0));
        sc.close();
    }

}
