import java.util.Scanner;

public class sevenDays{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int op;
        System.out.print("Enter number between 1-7: ");
        op= input.nextInt();

        if(op == 1) {
            System.out.println("It's Monday, Alaad ogie !");
        }else if(op == 2) {
            System.out.println("It's Tuesday. Bi chadnaa");
        }else if(op == 3) {
            System.out.println("It's Wednesday. Bi chadahguinee");
        }else if(op == 4) {
            System.out.println("It's Thursday. Bi gertee harij untmaar bna");
        }else if(op == 5) {
            System.out.println("It's Friday. Oroi yahiin?");
        }else if(op == 6) {
            System.out.println("It's Saturday. Ochigdor hetruulchihej");
        }else if(op == 7) {
            System.out.println("It's Sunday. margaash ahiad ajil! yag uhlee");
        }else{
            System.out.println("You have entered wrong input!");
        }
    }
}
