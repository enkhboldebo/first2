import java.util.Scanner;

public class RGB7119 {

    public static void main(String[] args){
        int a;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        if( a>=2 ){
            if( a<=4 ){
                System.out.println("Spring");
            }
        }if( a>=5 ){
            if( a<=7 ){
                System.out.println("Summer");
            }
        }if( a>=8 ){
            if( a<=10 ){
                System.out.println("Autumn");
            }
        }if( a>=11 ){
            if( a==12) {
                if(a==1){
                    System.out.println("Winter");
                }

            }
        }
    }
}
