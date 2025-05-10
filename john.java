import java.util.*;

public class john {

    public static void rent(int month, int rent, int days) {
        if (month > 0 && month <= 12) {
            if (month == 4 || month == 5 || month == 6 || month == 11 || month == 12) {
                int total = (rent * days * 120) / 100;
                System.out.println("rent on peak time" +  total);
            } else {
                System.out.println( "rent on normal time"+ rent * days);
            }
        } else {
            System.out.println("not a valid month");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int rent = sc.nextInt();
        int days = sc.nextInt();

        rent(month, rent, days);
    }
}
