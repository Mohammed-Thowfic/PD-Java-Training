import java.util.ArrayList;
import java.util.Iterator;

class Students{
    int rollno;
    String name;
    int marks;
    Students(int rollno,String name,int marks){
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+marks);
    }
}
public class StudList {
    public static void main(String[] args) {
        ArrayList<Students> stud=new ArrayList<>();
        stud.add(new Students(1,"Thowfic",70));
        stud.add(new Students(2,"Gomathy",80));
        stud.add(new Students(3,"Rithu",95));
        System.out.println("Student List:");
        for(Students s:stud){
            s.display();
        }
        int id=3;
        Iterator<Students> itr= stud.iterator();
        while(itr.hasNext()){
            Students s=itr.next();
            if(s.rollno==id){
                itr.remove();
            }
        }
        for(Students s:stud){
            s.display();
        }
    }
}