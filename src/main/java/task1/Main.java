package task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a;
        while (true){
            try {
                a = scanner.nextInt();
            } catch (InputMismatchException exception){
                scanner.nextLine();
                System.out.println("Integers only. Try again.");
                continue;
            }
            break;
        }

        System.out.print("Enter b: ");
        int b;
        while (true){
            try {
                b = scanner.nextInt();
            } catch (InputMismatchException exception){
                scanner.nextLine();
                System.out.println("Integers only. Try again.");
                continue;
            }
            break;
        }

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
    }
}
