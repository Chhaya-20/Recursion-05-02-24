import java.util.*;

public class RemoveDuplicate {
    static String remove(String s, int i) {
        if (i == s.length() - 1) {
            return "" + s.charAt(i);
        }
        char c = s.charAt(i);
        if (c == s.charAt(i + 1)) {
            return remove(s, i + 1);
        } else {
            return c + remove(s, i + 1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string  ");
        String s = sc.nextLine();
        System.out.println(remove(s, 0));
        sc.close();
    }

}
