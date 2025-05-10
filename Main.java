import java.util.*;

public class Main {

    public static void collatz(int n) {
        int count=0;
        while (n != 1) {
            System.out.println(n);
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            count++;
        }
        System.out.println(1);
        System.out.println(count+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        collatz(n);
    }
}
