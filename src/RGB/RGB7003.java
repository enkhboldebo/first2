package RGB;

import java.util.Scanner;

public class RGB7003 {

    public static void main(String[] args){

        int a, b;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        System.out.print(a*b + " " + (a+b) * 2);

    }
}
