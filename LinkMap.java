import java.util.LinkedHashMap;

public class LinkMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> hs = new LinkedHashMap<>();
        hs.put(1, "Hi");
        hs.put(4, "Good morning");
        hs.put(3, "Good afternoon");
        hs.put(2, "Good Evening");
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