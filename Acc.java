import java.util.Scanner;

public class Acc {


    public static void NearestInteger(int num , int m){

        int lower = (num / m) * m; 
        int upper = lower + m;    

        int distLower = Math.abs(num - lower);
        int distUpper = Math.abs(num - upper);

        if (distLower < distUpper) {
            System.out.println(lower);
        } else if (distUpper < distLower) {
            System.out.println(upper);
        } else {
            System.out.println( upper);
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        int m=sc.nextInt();
        NearestInteger(num, m);
    }
    
}
