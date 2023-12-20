package ExceptionHandling;

public class UncheckedException {

    public static void main(String[] args) {

        try {
            // Attempting to divide by zero
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handling division by zero error
            System.out.println("ArithmeticException caught: "+ e.getMessage());
        } finally {
            // This block always executes
            System.out.println("Finally block is executed.");
        }
        System.out.println("Program continues after try-catch-finally.");
    }
}
