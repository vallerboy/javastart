import javafx.scene.input.DataFormat;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Algot {
    public static void main(String[] args) {


        Algot kingOfArrays = new Algot();
        int[] table = new int[]{1, 1,1,1, 1, 2, 2, 2, 3};
        System.out.println(kingOfArrays.isKing(table));
    }

    private String isKing(int[] table) {

        String word;
        int counter = 0;
        String tableAsString = Arrays.toString(table);
        for (int i = 0; i < table.length; i++) {
            word = table[i] + "";
            Pattern pattern = Pattern.compile(word);
            Matcher matcher = pattern.matcher(tableAsString);
            while (matcher.find()) {
                counter++;
            }
            if (counter > (table.length / 2)) {
                return "1";
            }
            counter = 0;
        }
        return "-1";
    }
}