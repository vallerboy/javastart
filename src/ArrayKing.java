import java.util.Arrays;

public class ArrayKing {
    public static void main(String[] args) {
        int[] ints = {1,1,1,1,1,1,2,2,2,1,1,1,1,1,1};
        Arrays.sort(ints);

        int candi = ints[ints.length / 2 + 1];

        int counter = 0;
        for (int anInt : ints) {
            if(anInt == candi){
                counter ++;
            }
        }

        if(counter > ints.length / 2){
            System.out.println("Mamy króla " + candi);
        }else{
            System.out.println(-1);
        }
    }
}
