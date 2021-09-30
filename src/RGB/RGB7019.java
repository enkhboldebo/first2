package RGB;

import java.util.Scanner;

public class RGB7019 {

    public static void main(String[] args){
        int A, B, C, D;
        Scanner input = new Scanner(System.in);
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();
        A = B*C-D;
        System.out.println(A);
    }
}
