import java.util.*;

public class ReverseStack {
    static void insert_at_bottom(int x, Stack<Integer> st) {

        if (st.isEmpty())
            st.push(x);

        else {

            int a = st.peek();
            st.pop();
            insert_at_bottom(x, st);

            st.push(a);
        }
    }

    static void reverse(Stack<Integer> st) {
        if (st.size() > 0) {

            int x = st.peek();
            st.pop();
            reverse(st);

            insert_at_bottom(x, st);
        }
    }

    public static void main(String ags[]) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<Integer>();

        System.out.println("Enter no of elements ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int g = sc.nextInt();
            st.add(g);
        }
        System.out.println(st);
        reverse(st);
        System.out.println("Reverse Stack is ");
        System.out.println(st);

        sc.close();

    }

}
