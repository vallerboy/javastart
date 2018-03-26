import java.util.Arrays;

public class TaskMinMaxInArray {
    public static void main(String[] args) {
        TaskMinMaxInArray taskMinMaxInArray = new TaskMinMaxInArray();

        int[] result = taskMinMaxInArray.getMinMax(new int[]{12,2,4,5124,1,24,51,34,12,3221,312});
        System.out.println(Arrays.toString(result));
    }

    public int[] getMinMax(int[] data){
        int min = data[0];
        int max = data[0];

        for (int oneInt : data) {
            if(min > oneInt){
                min = oneInt;
            }
            if(max < oneInt){
                max = oneInt;
            }
        }

        return new int[]{min, max};
    }
}
