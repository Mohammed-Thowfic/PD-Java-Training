import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args) {
        LinkedList<Integer> stk = new LinkedList<>();
        stk.add(1);
        stk.add(2);
        stk.add(3);
        stk.add(4);
        stk.add(5);
        stk.add(6);
        stk.addFirst(1);
        stk.addLast(7);
        System.out.println(stk);
        System.out.println(stk.removeFirst());
        System.out.println(stk.removeLast());
        System.out.println(stk);
        System.out.println(stk.peekFirst());
        System.out.println(stk.peekLast());
        System.out.println(stk);
        System.out.println(stk.pollFirst());
        System.out.println(stk.pollLast());
        System.out.println(stk);
        stk.remove(0);
        System.out.println(stk);
        System.out.println(stk.isEmpty());
        System.out.println(stk.contains(5));
        System.out.println(stk.indexOf(5));
        System.out.println(stk.get(1));
    }
}