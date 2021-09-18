import java.util.Scanner;

public class RGB7015 {

    public static void main(String[] args){
        int hour, day, hour1;
        Scanner input = new Scanner(System.in);
        hour = input.nextInt(); //80
        day = hour / 24; // day = 3
        hour1 = hour - day*24; // 8
        System.out.print(day + " " + hour1);
    }
}
