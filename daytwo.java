public class daytwo {
        public static void main(String[] args){

        // int num = 123;
        // int ones=num%10;
        // int tens=(num/10)%10;
        // int hund=num/100;
        // System.out.println(ones*100+tens*10+hund);


        int total=729;
        int blackbread=65;
        int len=87;
        
        // blackbeard share
        int blackshare = (int)((blackbread / 100.0) * total);
        // len's share
        int remain=total-blackshare;
        int lenshare = (int)((len / 100.0) * remain);

        // share of prirates
        int pirates=(remain-lenshare)/3;


        System.out.println(blackshare);
        System.out.println(lenshare);
        System.out.println(pirates);

        
    }
    
}
