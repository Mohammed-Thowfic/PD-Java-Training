class Student {
    String name;

    void disp(String name) {
        this.name = name;
        System.out.println(this.name);
    }
}

class Dummy extends Student {
    final void disp() {
        super.disp("Thowfic");
    }
}

public class Keywords {
    public static void main(String[] args) {
        Dummy d1 = new Dummy();
        d1.disp();
    }
}