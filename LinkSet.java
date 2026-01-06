import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkSet {
    public static void main(String[] args) {
        LinkedHashSet stk = new LinkedHashSet();
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
        LinkedHashSet sc = new LinkedHashSet();
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