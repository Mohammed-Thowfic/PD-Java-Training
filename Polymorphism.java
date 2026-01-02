class Employee1{
    void display() {
        System.out.println("Method Overloading");
    }

    void display(int id, String name) {
        System.out.println(id + " " + name);
    }
}
class Details extends Employee1{
    @Override
    public void display() {
        System.out.println("Method Overriding");
    }

    @Override
    public void display(int id, String  name) {
        System.out.println(id+" "+name);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Employee1 m=new Employee1();
        m.display();
        m.display(1,"Thowfic");
        Details c=new Details();
        c.display();
        c.display(2,"Mohammed");
    }
}
