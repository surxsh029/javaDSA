import java.util.*;
public class arrayInsertion {


    public static int[] insertion(int []arr,int pos,int element,int size){

        for(int i=size;i>=pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos-1]=element;
        return arr;
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();

        int []arr=new int[size+1];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int pos=sc.nextInt();

        int element=sc.nextInt();

        System.out.println(Arrays.toString(arr));
        System.err.println(Arrays.toString(insertion(arr, pos, element, size)));

    }
    
}
