package RGB;

import java.util.Scanner;

public class RGB7114 {

    public static void main(String[] args){
        int a, b, c;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if( a%2 == 0 ) {
            System.out.println("YES");
        }else{
            System.out.println( "NO" );
        }if( b%2 == 0 ) {
            System.out.println("YES");
        }else{
            System.out.println( "NO" );
        }if( c%2 == 0 ){
            System.out.println( "YES" );
        }else{
            System.out.println( "NO" );
        }
    }
}
