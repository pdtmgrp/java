import java.util.Scanner;

public class InputTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("You entered integer: " + number);

        scanner.close();
    }
}