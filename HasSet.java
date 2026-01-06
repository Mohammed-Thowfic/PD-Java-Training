import java.util.HashSet;
import java.util.Iterator;

public class HasSet {
    public static void main(String[] args) {
        HashSet stk = new HashSet();
        stk.add(8);
        stk.add(4);
        stk.add("hi");
        stk.add(4);
        System.out.println(stk);
        Iterator it = stk.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(stk.contains(8));
        System.out.println(stk.isEmpty());
        HashSet sc = new HashSet();
        sc.add("Hello");
        sc.add(3);
        sc.add(2);
        System.out.println(sc);
        sc.addAll(stk);
        System.out.println(sc);
        sc.removeAll(stk);
        System.out.println(sc);
    }
}