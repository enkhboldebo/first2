package RGB;

import java.util.Scanner;

public class RGB7009 {

    public static void main(String[] args){
        int a, b, c;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = a/10;
        b = b%10;
        c = a%10;
        System.out.println(b*c);
    }
}
