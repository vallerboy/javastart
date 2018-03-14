import java.util.Scanner;

public class Task1String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imię: ");
        String name = scanner.nextLine();


        System.out.print("Podaj nazwisko: ");
        String surname  = scanner.nextLine();

        System.out.println("Twoję imię i nazwisko to: " + name + " " + surname);
    }
}
