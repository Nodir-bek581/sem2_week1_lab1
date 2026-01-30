import java.util.Scanner;

public class problem9 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 digit number: ");
        int number = input.nextInt();

        int first = number/100;
        int second = number%100/10;
        int third = number%10;

        int max = Math.max(first, Math.max(second, third));
        int min = Math.min(first, Math.min(second, third));

        int middle = (first+second+third) - max - min;

        System.out.printf("Before: %d%n", number);
        System.out.printf("After: %d%d%d", min, middle, max);

    }
}
