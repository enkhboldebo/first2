import java.util.Scanner;

public class RGB7012 {

    public static void main(String[] args){
        int a, hour, minute, second;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        hour = a/60/60;
        minute = a/60-60;
        second = a%(60*60);
        System.out.println(hour + " " + minute + " " + second);
    }
}
       //         ene ajillahgui bga


