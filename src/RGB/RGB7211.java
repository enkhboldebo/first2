package RGB;

import java.util.Scanner;

public class RGB7211 {

    public static void main(String[] args){
        int a, n;
        int answer;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        n = input.nextInt();
        for(int i=1; i<=n; i++){
            answer = a * a * n;
            System.out.println(a + "^" + i + "=" + answer);
        }
    }
}


        // zergiin tomyog gargaj chadahgui bna