package RGB;

import java.util.Scanner;

public class RGB7007 {
    public static void main(String[] args){
        int a, ten;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        ten = a % 10;
        System.out.println(ten);
    }
}
