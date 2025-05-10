import java.util.*;

public class conditional {

    public static void print(int num) {
        if (num >= 10 && num <= 99) {
            if (num > 20 && num % 2 == 0) {
                System.out.println("greater and even");
            } else if (num > 20 && num % 2 != 0) {
                System.out.println("greater and odd");
            } else {
                System.out.println("less than or equal to 20");
            }
        } else {
            System.out.println("Number is not a two-digit number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        print(num);
    }
}
