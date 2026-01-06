public class Recursion {
    public static void main(String[] args) {
        print(10);
    }

    static void print(int n) {
        if (n == 1) {
            System.out.println(1);
        } else {
            System.out.println(n);
            print(n - 1);
        }
    }
}
