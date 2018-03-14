import java.util.Scanner;

public class Task8String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        System.out.println(word.substring(word.length()-2));
        System.out.println(word.charAt(word.length()-2) + word.charAt(word.length()-1));  // tutaj suma charow (ascii)
    }
}
