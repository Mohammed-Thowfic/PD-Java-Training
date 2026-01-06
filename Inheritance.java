//Single and multiple
class Employeedetail {
    int level = 2;

    void work() {
        System.out.println("Working");
    }

    void talk() {
        System.out.println("Talking");
    }
}

class Department extends Employeedetail {
    int level = 4;
}

class Role extends Department {
    int level = 6;
}

public class Inheritance {
    public static void main(String[] args) {
        Role n1 = new Role();
        System.out.println(n1.level);
        n1.work();
        n1.talk();
    }
}
