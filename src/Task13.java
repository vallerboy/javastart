import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zmienna A: ");
        int a = scanner.nextInt();

        System.out.print("Zmienna B: ");
        int b = scanner.nextInt();

        System.out.print("Zmienna C: ");
        int c = scanner.nextInt();

        //Dowolna liczba zmiennoprzecinkowa 2.23 - to domyślnie double
        //Dowolna liczba całkowita 14 - to domyślnie integer

        float avg = (a + b + c) / 3.0f; //x,00
        System.out.println(String.format("%.2f", avg));
    }
}
