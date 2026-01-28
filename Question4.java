import java.util.Scanner;

public class DivisionLogic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.print("Enter the first number: ");
            int a = input.nextInt();

            System.out.print("Enter the second number: ");
            int b = input.nextInt();

            // Perform division
            int result = a / b;
            System.out.println("The result of " + a + " / " + b + " is: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: You cannot divide by zero!");
        } catch (Exception e) {
            System.out.println("Error: That wasn't a valid integer.");
        } finally {
            System.out.println("Closing the program...");
            input.close();
        }
    }
}
