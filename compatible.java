import java.util.*;
public class compatible {
    public static void main(String[] args) {
         Scanner sc=new Scanner (System.in);

         int n1=sc.nextInt();
         int n2=sc.nextInt();
         int comp = 1;

         if(n2!=n1){
            System.out.println("not comp");
         }
         else{
            int arr1[]= new int[n1];
            int arr2[]= new int[n2];

            for(int i=0;i<n1;i++){

                arr1[i]=sc.nextInt();
            }
            for(int j=0;j<n2;j++){
                arr2[j]=sc.nextInt();
            }
            for(int k=0;k<n1;k++){
                if(arr2[k]>=arr1[k]){
                    continue;
                } else {
                    comp = 0;
                    System.out.println("not comp");
                    break;
                }
            }

            if(comp==1){
                System.out.println("Comp");
            }
         }
    }
}
