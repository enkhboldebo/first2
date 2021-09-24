import java.util.Scanner;

public class RGB7106 {

    public static void main(String[] args){
        int a,b,c,d,answer;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();

        if(a<5 && b<5 && c<5 && d<5){
            answer = a*b*c*d;
            System.out.println(answer);
        }
    }
}
