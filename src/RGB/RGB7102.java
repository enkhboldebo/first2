package RGB;

import java.util.Scanner;

public class RGB7102 {

    public static void main(String[] args){
        int a, b;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        if( a > b){
            System.out.println( b );
        }else{
            System.out.println( a );
        }

        }
    }


