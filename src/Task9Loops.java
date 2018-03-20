import java.math.BigInteger;
import java.util.Scanner;

public class Task9Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj N: ");
        int n = scanner.nextInt();

        if(n == 1){
            System.out.println("Silnia: 1");
        }

        BigInteger sum = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            sum = sum.multiply(new BigInteger(String.valueOf(i)));
        }

        for (int i = 12; i > 0; i--) {
            
        }
        System.out.println("Silnia: " + sum);
    }
}
