public class CyclicRotation {
    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5};
        int[] intsNew = new int[ints.length];
        int k = 4;

        //O(n)
        for (int i = 0; i < ints.length; i++) {
            int shift = (i + k) % ints.length;
            System.out.print("Liczba: " + ints[i] + " idzie na index "  + shift + " ");
            intsNew[shift] = ints[i];
        }

        ///////////////////

        for (int i : intsNew) {
            System.out.print(i + " ");
        }
    }
}
