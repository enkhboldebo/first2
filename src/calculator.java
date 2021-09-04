import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int sum;
        int multi;
        int devide;
        System.out.print("Enter first number: ");
        a = scanner.nextInt();
        System.out.print("Enter second number: ");
        b = scanner.nextInt();
        sum = a + b;
        System.out.println("The sum of the two numbers that you have entered is: " + sum + " done!");
        multi = a * b;
        System.out.println("The multi of the two number that you have entered is: " + multi + " done!");
        devide = a / b;
        System.out.println("The devide of the two number that you have entered is: " + devide + " done!");
    }

}




