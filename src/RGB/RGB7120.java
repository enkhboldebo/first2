package RGB;

import java.util.Scanner;

public class RGB7120 {

    public static void main(String[] args){
        int a, b, c;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
