//throw
public class Exceptions1 {
     static void check(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age is invalid");
        }
    }

    public static void main(String[] args) {
        try {
            check(17);
        } catch (ArithmeticException E) {
            System.out.println(E);
            System.out.println(E.getMessage());
        }
        System.out.println("Completed");
    }
}