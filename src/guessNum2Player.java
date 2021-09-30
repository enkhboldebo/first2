import java.util.Random;
import java.util.Scanner;

public class guessNum2Player {

    public static void main(String[] args){
        Random num = new Random();
        int player1, player2, count=1;
        int randomNum = num.nextInt(100);
        Scanner input = new Scanner(System.in);
        System.out.print("How many players want to play: ");
        int a = input.nextInt();

        for(int i=1; i==randomNum; i++)
            System.out.print("Player 1 guess a number between 1-100: ");
        player1 = input.nextInt();
        if(player1>randomNum){
            System.out.println("Too high");
        }else{
            System.out.println("Too low");
        }

        System.out.print("Player 2 guess a number between 1-100: ");
        player2 = input.nextInt();
        if(player2>randomNum){
            System.out.println("Too high");
        }else{
            System.out.println("Too low");
        }

        while(randomNum != player1 || randomNum != player2){
            count++;

            if(player1>randomNum){
                System.out.println("Too high");
            }else{
                System.out.println("Too low");
            }
            System.out.println("Player 1 guess a number between 1-100: ");
            player1 = input.nextInt();
            System.out.println("Player 2 guess a number between 1-100: ");
            player2 = input.nextInt();

            if(player1 == randomNum){
                System.out.println("Congratulations player 1 you have won in " + count + " tries ");
            }else{
                System.out.println("Congratulations player 2 you have won in " + count + " tries ");
            }
        }

    }
}
