
    abstract class AbsEmployee{
        abstract void disp();
        void salary(){
            System.out.println("Salary");
        }
    }
    class Department extends AbsEmployee{
        public void disp(){
            System.out.println("Department");
        }
    }
    public class Abstraction {
        public static void main(String[] args) {
            Department e=new Department();
            e.disp();
            e.salary();
        }
    }
