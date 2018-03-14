import java.util.Random;

public class StringExample {
    public static void main(String[] args) {
        Random random = new Random();

        int s = 5;
        int f = 5;
        Integer cos = new Integer(5);
        Integer cos1 = new Integer(5);

        String helloText = new String("Heloo!");
        String diffText = new String("Heloo!");

        //== porównuje referencje!
        if(helloText.equals(diffText)){
            System.out.println("Są takie same!");
        }else{
            System.out.println("Nie są takie same");
        }

        String coska = "Hello!"; //HHello leci do pamieci
        coska = "Hello2"; //Hello2
        System.out.println(coska);
        String coska1 = "Hello!";

        StringBuilder xxx = new StringBuilder();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            xxx.append("hello");
    }
        long stopTime = System.currentTimeMillis();


        System.out.println("Czas: " + (stopTime - startTime));

        String cosiek15 = "I mamy tutaj zdanie";

    }
}
