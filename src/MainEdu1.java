import java.util.Scanner;

public class MainEdu1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //12 14 15 1 2 3 5 1

        System.out.print("Podaj liczby: ");
        String numbers = scanner.nextLine();

        String[] intsInString = numbers.split(" ");
        int[] intArray = new int[intsInString.length];

        for (int i = 0; i < intsInString.length; i++) {
            intArray[i] = Integer.valueOf(intsInString[i]);
        }
        ////////////////////////////////////////////////////////
        int sum = 0;
        for (int i : intArray) {
            sum += i;
        }

        for (int i : intArray) {
            System.out.println(sum);
            sum -= i;
        }

    }
}
