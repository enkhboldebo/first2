package nestedForLoop;

import java.util.Scanner;

public class nestedForLoop {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int star = input.nextInt();
        for(int i = 0; i<star; i++){
            for(int j=0; j<star; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
