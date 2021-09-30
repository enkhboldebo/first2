package RGB;

import java.util.Scanner;

public class RGB7104 {

    public static void main(String[] args) {
        int a, b, c, d;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        if (a < b && a < c && a < d) {
            System.out.println(a);
        }else if (b < a && b < c && b < d) {
            System.out.println(b);
        }else {
            System.out.println(d);
        }if(c < a && c < b && c < d) {
            System.out.println(c);
        }else {
            System.out.println(d);
        }

        }

    }

    //      zov ajillahgui bna