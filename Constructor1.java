//Constructor chaining
class Name {
    String name;

    Name(String name) {
        this.name = name;
        System.out.println("parent constructor");
        System.out.println(name);
    }
}

public class Constructor1 extends Name {
    int rollno;

    Constructor1(String name, int rollno) {
        super(name);
        this.rollno = rollno;
        System.out.println("Student Constructor");
    }

    void display() {
        System.out.println(name + " " + rollno);
    }

    public static void main(String[] args) {
        Constructor1 s1 = new Constructor1("Alex", 12);
        s1.display();
    }
}
