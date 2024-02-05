import java.util.*;

public class RemoveX {

    static String remove(String s, int i) {
        // return "abc";
        if (i == s.length() - 1 && s.charAt(i) == 'x') {
            return "";
        } else if (i == s.length() - 1) {
            return "" + s.charAt(i);
        }
        if (s.charAt(i) == 'x') {
            return remove(s, i + 1);
        } else {
            return s.charAt(i) + remove(s, (i + 1));
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string  ");
        String s = sc.nextLine();
        System.out.println("After removing " + remove(s, 0));
        sc.close();
    }

}
