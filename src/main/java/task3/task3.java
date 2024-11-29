package task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task3 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,10);

        System.out.print("Numbers: ");
        for (Integer number : numbers){
            System.out.print(number + " ");
        }
        System.out.println();

        List<Integer> evenNumbers = numbers.stream().filter(number -> (number % 2) == 0).collect(Collectors.toList());

        System.out.print("Even numbers: ");
        for (Integer number : evenNumbers){
            System.out.print(number + " ");
        }
    }
}
