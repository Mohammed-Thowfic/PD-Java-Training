public class Revnumber {
    public static void main(String[] args) {
        int a = 201, rev = 0;
        int temp = a;
        while (temp != 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        System.out.println(rev);
    }
}