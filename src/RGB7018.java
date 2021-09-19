import java.util.Scanner;

public class RGB7018{

    public static void main(String[] args){
        int year, month, month1;
        Scanner input = new Scanner(System.in);
        year = input.nextInt();
        month = input.nextInt();
        month1 = year * 12 + month;
        System.out.println( month1 );
    }
}