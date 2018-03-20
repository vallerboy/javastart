import java.util.Scanner;

public class Task8Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String correctPassword = "Polska";

        String passwordTyped;
        do{
            System.out.print("Podaj hasło: ");
            passwordTyped = scanner.nextLine();
        }while (!correctPassword.equals(passwordTyped));

        System.out.println("Podałeś prawidłowe hasło!");
    }


}
