import java.util.Scanner;

public class sameArray {

    public static void main(String[] args) {
        
          Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int two=sc.nextInt();



        int arr[]=new int[n];
        int arr2[]=new int[two];
        int sum1=0;
        int sum2=0;

        for(int i=0;i<n;i++){

            arr[i] = sc.nextInt();
           sum1=sum1+arr[i];
        }

        for(int i=0;i<n;i++){

            arr2[i] = sc.nextInt();
           sum2=sum2+arr2[i];
        }

        if(sum1==sum2 && n==two){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }
    
}
