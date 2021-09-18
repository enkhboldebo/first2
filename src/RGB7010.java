import java.util.Scanner;

public class RGB7010 {

    public static void main(String[] args){
        int a, b, c, d;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = a/100%10;
        c = a/10%10;
        d = a%10;
        System.out.println(b+c+d);
    }
}
