package RGB;

import java.util.Scanner;

public class RGB7014 {

    public static void main(String[] args){
        int hour, minute, second, a;
        Scanner input = new Scanner(System.in);
        hour = input.nextInt();
        minute = input.nextInt();
        second = input.nextInt();
        a = hour * (60*60) + minute * 60 +second;
        System.out.println( a );
    }
}
