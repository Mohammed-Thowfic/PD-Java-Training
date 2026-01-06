class Sample {
    Sample() {
        System.out.println("Default");
    }

    Sample(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Sample s1 = new Sample();
        Sample s2 = new Sample(5, 6);

    }
}