package RGB;

import java.util.Scanner;

public class RGB7008 {

    public static void main(String[] args){
        int a, ten;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        ten = a/10;
        ten = ten%10;
        System.out.println(ten);
    }
}
