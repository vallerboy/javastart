import java.util.Scanner;

public class Task9String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        System.out.println(word.contains("z") && word.contains("y"));
    }
}
