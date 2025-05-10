public class harsad {

    public static void main(String[] args) {
        
        // int num=2345;
        // int reverse=0;

        // // int first=num%10;
        // // int tens=(num/10)%10;
        // // int hund=(num/100)%10;
        // // int thou=num/1000;

        // // System.out.println(thou);
        // // System.out.println(hund);
        // // System.out.println(tens);
        // // System.out.println(first);

        // while (num > 0) {
        //     int digit = num % 10;    
        //     reverse=reverse*10+digit;
        //     num = num / 10;     
        // }

        // while(reverse>0){
        //     int digit=reverse%10;
        //     System.out.println(digit);
        //     reverse=reverse/10;

        // }


        int num =12;
        int originalnum=num;
        

        int square=num*num;
        int reverse1=0;
        int reverse2=0;

        while(originalnum>0){
            int digit=originalnum%10;
            reverse1=reverse1*10+digit;
            originalnum=originalnum/10;
        }
        
        int revSqure=reverse1*reverse1;
        int temp=revSqure;
        while(revSqure>0){
            int digit=revSqure%10;
            reverse2=reverse2*10+digit;
            revSqure=revSqure/10;
        }

        System.out.println(reverse2);
        System.out.println(square);
        if(reverse2==square){
            System.out.println("adam no");
        }
        else{
            System.out.println("not adam");
        }
    }
    
}
