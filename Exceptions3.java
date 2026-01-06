class InvalidMarksException extends RuntimeException{
    public InvalidMarksException(String msg){
        super(msg);
    }
}
public class Exceptions3 {
    static void check(int marks) {
        if(marks>0 || marks<100) {
            throw new InvalidMarksException("Mark lies between 0 and 100");
        }
    }
    public static void main(String[] args) {
        try {
            check(96);
        }
        catch (InvalidMarksException E){
            System.out.println(E);
        }
    }
}