import java.util.Scanner;

public class Task5String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        System.out.println(word.charAt(word.length() - 2));
    }
}
