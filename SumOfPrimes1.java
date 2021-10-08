package hcl.com.ebox;
import java.util.Scanner;

public class SumOfPrimes1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Find sum of prime numbers upto : ");
        long n = scanner.nextInt();
        long sum = 2;
        for(int num = 2; num <= n; num++) {
            int i;
            for(i = 2; i <= (num / 2); i++) {
                if(num % i == 0) {
                    i = num;
                    break;
                }
            }
            if(i != num) {
                sum += num;            
            }
        }
        System.out.println("\nSum of all prime numbers is " + sum);
    }
}
