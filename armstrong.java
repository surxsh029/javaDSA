public class armstrong {

    public static void main(String[]args){

        int n= 1634;
        int power=0;
        int temp1=n;

        while(temp1>0){
            power++;
            temp1/=10;
        }
        int sum=0;
        int temp2=n;

        while(temp2>0){
            int x=temp2%10;
            sum+=Math.pow(x, power);
            temp2=temp2/10;
        }

        if(sum==n){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }


    }
    
}
