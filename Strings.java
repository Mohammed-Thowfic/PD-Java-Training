//Stringbuffer and Stringbuilder
public class Strings {
    public static void main(String[] args) {
        Strings sb=new Strings();
        String[] str={"Thowfic","Rithu","Visva","Gomathy","Hema","Iniya"};
        sb.joinwords(str);
    }
    private void joinwords(String[] names){
        String sentence="";
        StringBuffer sb=new StringBuffer("");
        StringBuffer sb2=new StringBuffer("Thowfic");
        sb2.insert(6,'q');
        System.out.println(sb2);
        sb2.replace(0,2,"lo");
        System.out.println(sb2);
        sb2.reverse();
        System.out.println(sb2);
        StringBuilder bui=new StringBuilder("Raja");
        bui.delete(3,4);
        System.out.println(bui);
        bui.append("Kumar");
        System.out.println(bui);
        for(String name:names){
            sb.append(name);
            System.out.println("Buffer:"+sb.hashCode());
            sentence+=name;
            System.out.println("Normal:"+sentence.hashCode());
        }
        System.out.println(sb);
        System.out.println(sentence);
    }
}
