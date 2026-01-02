public class Prime {
    public static void main(String[] args) {
        int a=5,flag=0;
        if(a==0 || a==1){
            flag=1;
        }
        else {
            for (int i = 2; i <= a / 2; i++) {
                if (a % i == 0) {
                    flag = 1;
                    break;
                }
           /* int i=2;
            while(i<=a/2){
                if(a%i==0){
                    flag=1;
                    break;
                }
                i++;
            }*/
            }
        }
        if (flag==0){
            System.out.println("prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
}
