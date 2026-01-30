import java.util.Scanner;

public class problem7 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();
        System.out.print("Enter per gallon: ");
        double fuel_efficiency = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double price = input.nextDouble();

        double costOfDriving = (price/fuel_efficiency)*distance;

        System.out.printf("The cost of driving is %.2f", costOfDriving);
    }
}
