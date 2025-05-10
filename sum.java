public class sum {

    public static void main(String[]args){

        int num=798956;

        int evenSum=0;
        int oddSum=0;
        while (num !=0) {

            int rem=num%10;

            if(rem%2==0){
                evenSum+=rem;
            }
            else{
                oddSum+=rem;
            }
            num=num/10;
            
        }

        System.out.println("evensum="+evenSum);
        System.out.println("oddsum="+oddSum);
    }
    
}
