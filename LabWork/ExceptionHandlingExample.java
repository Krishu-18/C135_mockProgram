package LabWork;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
           } 
        catch (ArithmeticException e) {
            // Catch the exception and handle it
            System.out.println("An exception occurred: " + e.getMessage());
          }
    }

    // A method that divides two numbers and may throw an exception
    public static int divide(int numerator, int denominator) {
        if (denominator == 0) {
            // Throw an ArithmeticException if the denominator is zero
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return numerator / denominator;
    }
}
         /*Output of this Program:-An exception occurred: Division by zero is not allowed*/
         
