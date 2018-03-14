import java.time.LocalDateTime;

public class LogicalOperator {
    public static void main(String[] args) {

        int age = 23;
        int dayOfWeek = 4;

        if(!(age >= 18 || dayOfWeek == 5)){
            System.out.println("Jestem pełnoletni");
        }else if(age == 17){
            System.out.println("Jeszcze trochę...!");
        }else{
            System.out.println("Jesteś za młody");
        }

        int validaton = age >= 18 ? 0 : 1; //return
        //operatory logiczne: > < >= <= == != !
        switch (age){
            case 23:{
                System.out.println("Masz 23 lata");
                break;
            }
            case 22:{
                System.out.println("Masz 22 lata");
                break;
            }
            //jest opcjonalny
            default: {
                System.out.println("Nie obsługujemy takiego wieku!");
            }
        }
    }
}
