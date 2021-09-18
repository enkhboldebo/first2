import java.util.Scanner;

public class sumOdd {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any positive number: ");
        int userInput = in.nextInt();
        int sum = 0;

        for(int i = 1; i <= userInput; i++) {
            if(i % 2 == 1){
                sum = sum + i;

            }
        }
        System.out.println("sum of odd numbers from 1 to  " + userInput + " is " + sum);
    }
}
