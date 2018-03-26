public class TaskNWD {
    public static void main(String[] args) {
        TaskNWD taskNWD  = new TaskNWD();

        System.out.println(taskNWD.NWD(100, 50));
    }

    public int NWD(int a, int b) {
        while (a != b){
            if(a > b){
                a -= b;
            }else{
                b -= a;
            }
        }
        return a;
    }
}
