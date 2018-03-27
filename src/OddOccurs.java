import java.lang.reflect.Array;
import java.util.Arrays;

public class OddOccurs {
    public static void main(String[] args) {

        int[] test = {1,2,3,1,3,5,6,6,5};
        //int[] test = {1,1,2,3,3,5,5,7,7,8};
        Arrays.sort(test);

        for (int i = 0; i < test.length; i += 2) {
            if(i == test.length - 1){
                System.out.println(test[i]);
                break;
            }
            if(test[i] != test[i + 1]){
                System.out.println(test[i]);
                break;
            }
        }
    }
}
