import java.util.*;
public class odd {

    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);

        int lowerbound=sc.nextInt();

        int upperbound=sc.nextInt();

        int odd_count=0;
        int sumofodd=0;

        for(int i=lowerbound;i<upperbound;i++){

            int temp=i;
            odd_count=0;

            while (temp!=0) {
                temp=temp/10;
                odd_count++;
                
            }
            if(odd_count %2 !=0){

                sumofodd++;

            }
        }
        System.out.println(sumofodd);


    }
    
}
