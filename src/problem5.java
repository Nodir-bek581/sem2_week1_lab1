import java.util.Scanner;

public class problem5 {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of the sides and height of the Equilateral triangle: ");
        int length = input.nextInt();
        int height = input.nextInt();

        double area = (Math.sqrt(3)/4)*(length*length);
        double volume = area*height;

        System.out.print("Area: "+area);
        System.out.print("Volume: "+volume);
    }
}
