package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string1: ");
        String string1 = scanner.next();

        System.out.print("Enter string2: ");
        String string2 = scanner.next();

        if (string1.equals(string2)){
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
