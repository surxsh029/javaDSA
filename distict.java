import java.util.*;
public class distict {

    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);

        int n= sc.nextInt();

        int arr[]=new int[n];

        
        int distinct = 0;

        for(int i=0;i<n;i++){

            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int count=0;
            
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }

                if(arr[i]==arr[j]){
                    count = 1;
                    break;
                }
            }
            if(count == 0){
                distinct++;
            }
        }

        System.out.println(distinct);
    }
    
}
