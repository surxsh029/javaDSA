public class singlesum {

    public static void main(String[]args){

        int num=2345;

        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
            if(sum>=10 && num==0){
                num=sum;
                sum=0;
            }
        }
        System.out.println(sum);
        
    }
}
