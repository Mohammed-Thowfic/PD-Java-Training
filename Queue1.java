import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        Queue que = new LinkedList();
        que.add(5);
        que.add("hii");
        que.add(8);
        que.add(2);
        System.out.println(que.peek());
        System.out.println(que.contains(8));
        System.out.println(que.remove("hii"));
        System.out.println(que);
    }
}
