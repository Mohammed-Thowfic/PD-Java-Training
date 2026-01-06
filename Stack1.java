import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.add(5);
        System.out.println(stk);
        System.out.println(stk.peek());
        System.out.println(stk.remove(0));
        stk.clear();
        System.out.println(stk);

    }
}