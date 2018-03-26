import java.util.Scanner;

public class MainEdu2 {
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
        ///////////////////////////////////////////

        //1 2 3 1 2 3 4 2 3 1 2

        for (int i : intArray) {
            int counter = 0;
            for (int i1 : intArray) {
                if(i == i1){
                    counter++;
                }
            }

            if(counter >= 3){
                System.out.println("TAK");
                System.exit(0);
            }
        }
        System.out.println("NIE");
    }
}
