import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> hs = new TreeMap<>();
        hs.put(1, "Hi");
        hs.put(4, "Good morning");
        hs.put(3, "Good afternoon");
        hs.put(2, "Good Evening");
        hs.put(4, "Good");
        System.out.println(hs);
        hs.remove(4);
        System.out.println(hs);
        System.out.println(hs.containsKey(3));
        System.out.println(hs.containsValue("Hii"));
        System.out.println(hs.isEmpty());
        System.out.println(hs.keySet());
        System.out.println(hs.values());
        System.out.println(hs.get(2));
        System.out.println(hs.entrySet());
        System.out.println(hs);
    }
}