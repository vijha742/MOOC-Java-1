
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = Integer.valueOf(scanner.nextLine());
        if (value < 0) {
            System.out.println(-1*value);
        } else {
            System.out.println(value);
        }
    }
}
