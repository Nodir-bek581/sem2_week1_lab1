import java.util.Scanner;

public class problem8 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 4 digit number: ");
        int number = input.nextInt();
        int thousandth = number/1000;
        int hundredth = number/100%10;
        int tenth = number%100/10;
        int first = number%10;
        int sum = thousandth+hundredth+tenth+first;

        System.out.printf("%d + %d + %d + %d = %d", thousandth, hundredth, tenth, first, sum);
    }
}
