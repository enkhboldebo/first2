import java.util.Scanner;

public class RGB7210 {

    public static void main(String[] args){
        int a;
        int answer;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        for(int i=1; i<=10; i++){
            answer = a * i;
            System.out.println(a + "*" + i + "=" + answer);
        }
    }
}
