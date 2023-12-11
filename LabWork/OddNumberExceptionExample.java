package LabWork;

public class OddNumberExceptionExample {
    public static void main(String[] args) {
        try {
            int number = 7; // Change this number to test different cases.
            checkEvenNumber(number);
            System.out.println(number + " is an even number.");
          } 
        catch (OddNumberException e) {
              System.out.println("An exception occurred: " + e.getMessage());
           }
    }

    // A method that checks if the provided number is even and throws an exception if it's odd.
    public static void checkEvenNumber(int number) throws OddNumberException {
        if (number % 2 != 0) {
            // If the number is odd, throw a custom exception (OddNumberException).
            throw new OddNumberException("Odd numbers are not allowed.");
        }
    }
}

// Custom exception class for odd numbers.
class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

        /*Output of this Program:-An exception occurred: Odd numbers are not allowed.*/

          