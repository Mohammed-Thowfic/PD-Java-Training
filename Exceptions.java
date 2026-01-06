//try,catch,finally
public class Exceptions {
    public static void main(String[] args) {
        try {
            System.out.println(5 / 0);
        } catch (ArithmeticException E) {
            System.out.println(E);
            System.out.println("Divide by 0 is not possible");
        } finally {
            System.out.println("finally block");
        }
        System.out.println("hello");
    }
}