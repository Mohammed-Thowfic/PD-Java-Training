import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(10);
        ts.add(1);
        ts.add(3);
        ts.add(20);
        System.out.println(ts);
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.headSet(10));
        System.out.println(ts.tailSet(3));
        System.out.println(ts.pollFirst());
        System.out.println(ts);
        System.out.println(ts.pollLast());
        System.out.println(ts);
    }
}