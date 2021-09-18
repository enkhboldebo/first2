import java.util.Scanner;

public class forLoop {

    public static void main(String[] args){

        System.out.print("Enter any positive number: ");
        Scanner in = new Scanner(System.in);
        int userInput = in.nextInt();

        for(int i = userInput; i > 0; i--){
            System.out.print(i + " ");
        }
    }
}
