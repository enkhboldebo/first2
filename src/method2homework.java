import java.util.Scanner;

public class method2homework {
    public static void main(String[] args) {
        System.out.print("Enter number between 1-7: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String day;



        while(num!=-1){
            day = weekFunc(num);
            System.out.println("It's" + day);
            System.out.print("Enter number between 1-7 (-1 to exit): ");
            num = input.nextInt();
        }
        System.out.println("Thank you for using my application");

    }
    public static String weekFunc(int op){

        String result;

        if(op == 1){
            result = " Monday";
        }else if(op == 2){
            result = " Tuesday";
        }else if(op == 3){
            result = " Wednesday";
        }else if(op == 4){
            result = " Thursday";
        }else if(op == 5){
            result = " Friday";
        }else if(op == 6){
            result = " Saturday";
        }else if(op == 7){
            result = " Sunday";
        }else {
            result = " Wrong number";
        }

        return result;
    }
}
