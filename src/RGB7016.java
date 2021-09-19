import java.util.Scanner;

public class RGB7016 {

    public static void main(String[] args){
        int day, hour, hour1;
        Scanner input = new Scanner(System.in);
        day = input.nextInt();
        hour = input.nextInt();
        hour1 = day * 24 + hour;
        System.out.println( hour1 );
    }
}
