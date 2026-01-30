import java.util.Scanner;

public class Main {
    public static void main() {
        System.out.print("Hello, what is your name: ");
        Scanner input = new Scanner(System.in);
        String name=input.nextLine();
        System.out.print("How are you, "+name+", how old are you ");
        String age = input.nextLine();
        int age1 = Integer.parseInt(age);
        System.out.println(name+", you are "+age);

    }
}