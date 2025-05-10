import java.util.*;
public class practice {


    public static void trendy(int num){

        if(num>=100 && num<1000){
            int mid = (num/10)%10;

            if(mid%3==0){
                System.out.println("trendy");
            }
            else{
                System.out.println("not trendy");
            }


        }else{
            System.out.println("invalid input");
        }
    }


    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);

        int num=sc.nextInt();
        trendy(num);

    }
    
}
