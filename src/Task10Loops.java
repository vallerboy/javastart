import java.util.Scanner;

public class Task10Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wielkosc: ");
        int n = scanner.nextInt();

        
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//           stringBuilder.append("*");
//           System.out.println(stringBuilder.toString());
//        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n ; i++) {
            for(int k = n - 1; k > i; k--){
                System.out.print(" ");
            }
            for(int c = i * 2; c >= 0; c--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
