import java.util.Scanner;

public class Task11Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj zdanie: ");
        String sentence = scanner.nextLine();

        for (int i = 0; i < sentence.length(); i++) {
            char conChar = sentence.charAt(i);

            // if(Character.isDigit(conChar)){
            if (conChar >= 48 && conChar <= 57) {
                System.out.println(conChar);
            }
        }
    }
}
