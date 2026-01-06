//throws
class UserDefined extends Exception {
    UserDefined(String str) {
        super(str);
    }
}

public class Exceptions2 {
    static void check(int age) throws UserDefined, ArithmeticException {
        if (age < 18) {
            throw new UserDefined("Age is invalid");
        } else {
            throw new ArithmeticException("Age is valid");
        }
    }

    public static void main(String[] args) {
        try {
            check(17);
        } catch (UserDefined E) {
            System.out.println(E);
            System.out.println(E.getMessage());
        } catch (ArithmeticException E) {
            System.out.println(E);
            System.out.println(E.getMessage());
        }
        System.out.println("Completed");

    }
}