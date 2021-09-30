package RGB;

import java.util.Scanner;

public class RGB7004 {

    public static void main(String[] args){
        int a;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.print ( a*a*a + " " + a*a*6 );

    }
}
