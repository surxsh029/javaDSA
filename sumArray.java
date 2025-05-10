import java.util.*;
public class sumArray {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){

            arr[i] = sc.nextInt();
        }
        int diff = arr[0];
        for(int i=1;i<n;i++){
            diff = diff-arr[i];
        }
        System.out.println(diff);
    }
}