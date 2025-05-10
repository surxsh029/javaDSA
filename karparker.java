import java.util.*;
public class karparker {

    public static boolean check(int n){

        int sq=n*n;
        int temp1=sq;
        int count =0;

        while(temp1>0){
            count++;
            temp1/=10;
        }
        int pos=10;
        while (count-1>0) {
        int temp2=sq;
        int x=temp2%pos;
        temp2/=pos;

        if(temp2+x==n){
            return true;
        }
        pos=pos*10;
            count--;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();

        System.out.println(check(n));
       
       
    }
    
}
