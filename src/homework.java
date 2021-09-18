import java.util.Scanner;

public class homework {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter your number: ");
        num = input.nextInt();

        {
        if (num % 2 == 0 && num > 0){
                System.out.println("ogogdson too tegsh mon eyreg too baina");}
        else if (num%2 == 0 && num<0){
            System.out.println("ogogdson too tegsh mon sorog too baina");
        }else if (num%2 == 1 && num > 0){
            System.out.println("ogogdson too sondgoi eyreg too baina");
        }else if (num%2 != 0 && num < 0)
            System.out.println("ogogdson too sondgoi mon sorog too baina");
}}}