package RGB;

import java.util.Scanner;

public class RGB7017 {

    public static void main(String[] args){
        int month, year, month1;
        Scanner input = new Scanner(System.in);
        month = input.nextInt();
        year = month / 12;
        month1 = month%12;
        System.out.println( year + " " + month1);
    }


}
