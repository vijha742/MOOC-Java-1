
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int value1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int value2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int value3 = Integer.valueOf(scanner.nextLine());
        // type conversion from int to double
        System.out.println("The average is " + (1.0*(value1+value2+value3)/3));
    }
}
