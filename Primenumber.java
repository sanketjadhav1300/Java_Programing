import java.util.*;

public class Primenumber {
    public static void main(String[] args) {
        int n = 0, a = 0, i = 2;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        n = s.nextInt();
        while (i <= n / 2) {
            if (n % i == 0) {
                a = 1;
                break;
            }
                i++;
        }
        if (a == 1) {
            System.out.println(n + " is  a prime number");
        }
        else {
            System.out.println(n + " is a not prime number");
        }
    }
                        
}
