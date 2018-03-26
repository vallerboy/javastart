import java.util.Random;
import java.util.Scanner;

public class MainEdu3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] ints = new int[15];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(200);
            System.out.print( ints[i] + " ");
        }

        ////////////////////////////////////////
        String result  = "";
        for (int anInt : ints) {
            int rest = anInt % 37;
            if(!result.contains(String.valueOf(rest))){
                result += anInt + ";";
            }
        }

        System.out.println("Ilość różnych: " + result.split(";").length);
    }
}
