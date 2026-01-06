import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrList {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("Hi");
        arr.add("Thowfic");
        System.out.println(arr);
        for(String s:arr){
            System.out.println(s);
        }
        Iterator it = arr.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}