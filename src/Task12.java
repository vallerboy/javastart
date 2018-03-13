import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zmienna A: ");
        int a = scanner.nextInt();

        System.out.print("Zmienna B: ");
        int b = scanner.nextInt();

        a = a + b;
        b = a - b; // Tutaj od teraz jest A
        a = a - b; // Tutaj od teraz jest B

        System.out.println("Wartość B: " + b);
        System.out.println("Wartość A: " + a);
    }
}
