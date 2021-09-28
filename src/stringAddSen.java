import java.util.Scanner;

public class stringAddSen {

    public static void main(String[] args){
        String addSen;
        String finalAnswer;
        Scanner input = new Scanner(System.in);
        System.out.println("ene oguulberiig tsaash n urgeljluulne uu: ");
        addSen = input.next();
        finalAnswer = addSen.concat(addSen);
        System.out.print(addSen);
    }
}
