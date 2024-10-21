public class ControlAndLoop {
    public static void main(String[] args) {
    
        int number = 10;

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}