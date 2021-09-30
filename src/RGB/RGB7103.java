package RGB;

import java.util.Scanner;

public class RGB7103 {

    public static void main(String[] args){
        int a, b, c;
        Scanner input= new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if( a > b ) {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        }else if( a < b ){
            if( c < b){
                System.out.println( b );
            }else{
                System.out.println(c);
            }

        }
        }

    }

