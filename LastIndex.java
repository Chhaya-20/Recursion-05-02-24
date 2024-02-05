import java.util.*;

public class LastIndex {

    public static int Search(int[] arr, int x, int i, int idx, int n) {
        if (n - 1 == i) {
            if (arr[i] == x)
                idx = i;
            return idx;
        }
        if (arr[i] == x) {
            idx = i;
        }
        return Search(arr, x, i + 1, idx, n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elem ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Target elem ");
        int x = sc.nextInt();
        int idx = Search(arr, x, 0, 0, n);
        System.out.println(idx);
        sc.close();
    }
}