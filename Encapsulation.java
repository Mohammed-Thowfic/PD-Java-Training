class Employee{
    private int empid;
    private String name;
    private double salary;
    public int getEmpid(){
        return empid;
    }
    public void setEmpid(int empid){
        this.empid=empid;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.setEmpid(064);
        emp.setName("Thowfic");
        emp.setSalary(30000);
        System.out.println("Empid:"+emp.getEmpid());
        System.out.println("Name:"+emp.getName());
        System.out.println("Salary:"+emp.getSalary());
    }
}
