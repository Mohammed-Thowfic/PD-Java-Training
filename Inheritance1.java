// hybrid and hierarchial
class Employee3 {
    int level = 2;

    void work() {
        System.out.println("8 hours working ");
    }
}

class Department2 extends Employee3 {
    int level = 4;

    void disp() {
        System.out.println("3 departments");
    }
}

class Roles extends Employee3 {
    int level = 6;

    void display() {
        System.out.println("3 Roles");
    }
}

class Sub_dep extends Department2 {
    int level = 1;

    void print() {
        System.out.println("Sub Departments");
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        Department2 m = new Department2();
        System.out.println(m.level);
        m.work();
        m.disp();
        Roles r = new Roles();
        System.out.println(r.level);
        r.work();
        r.display();
        Sub_dep s1 = new Sub_dep();
        System.out.println(s1.level);
        s1.print();
        s1.disp();
        s1.work();
    }
}