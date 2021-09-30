package RGB;

import java.util.Scanner;

public class RGB7013 {
    public static void main(String[] args){
        int minute, second, a;
        Scanner input = new Scanner(System.in);
        minute = input.nextInt();
        second = input.nextInt();
        a = minute*60+second;
        System.out.println (a);
    }
}
