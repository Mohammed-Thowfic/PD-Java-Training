//Multiple
interface MulEmployee {
    abstract void disp();
}

interface Roles1 {
    abstract void display();
}

class Department3 implements MulEmployee, Roles1 {
    public void disp() {
        System.out.println("Department");
    }

    public void display() {
        System.out.println("Roles");
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        Department3 d = new Department3();
        d.disp();
        d.display();
    }
}