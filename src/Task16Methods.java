public class Task16Methods {
    public static void main(String[] args) {
        Task16Methods task16 = new Task16Methods();
        int[] result = task16.getTwoDividersArray(new int[]{2, 6, 13, 19, 20, 123, 11});

        for (int i : result) {
            System.out.println(i);
        }
    }

    public boolean hasOnlyTwoDividers(int number){
                if(number == 1) {
                    return false;
                }
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        return false;
                    }
                }
           return true;
    }
    
    public int[] getTwoDividersArray(int[] ints){
        int[] twoDividersArray = new int[ints.length];
        int counter = 0;

        for (int anInt : ints) {
            if(hasOnlyTwoDividers(anInt)){
                twoDividersArray[counter] = anInt;
                counter++;
            }
        }

        return twoDividersArray;
    }
}
