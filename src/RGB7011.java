import java.util.Scanner;

public class RGB7011 {

    public static void main(String[] args){
        int a,minute,second;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        minute = a/60;
        second = a%60;
        System.out.println(minute + " " + second);
    }
}
