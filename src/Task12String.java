import java.util.Scanner;

public class Task12String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        System.out.println(word.replace("*", ""));
    }
}
