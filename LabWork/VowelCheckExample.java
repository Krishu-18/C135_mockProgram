package LabWork;
public class VowelCheckExample {
    public static void main(String[] args) {
        String inputString = "Hello"; // Change the input string to test different cases.

        try {
            // Call the checkForVowels method and pass the input string as a parameter.
            checkForVowels(inputString);
            System.out.println("The input string contains vowels.");
          } 
        catch (NoVowelsException e) {
            // If a NoVowelsException is thrown, catch it here and print an error message.
            System.out.println("No vowels found in the input string. Exception: " + e.getMessage());
        }
    }

    // A method that checks if a string contains vowels and throws an exception if it doesn't.
    public static void checkForVowels(String input) throws NoVowelsException {
        if (!input.matches(".*[AEIOUaeiou].*")) {
            // If the string does not contain any vowels, throw a NoVowelsException.
            throw new NoVowelsException("No vowels found in the input string.");
        }
    }
}

// Custom exception class for strings without vowels.
class NoVowelsException extends Exception {
    public NoVowelsException(String message) {
        super(message);
    }
}

          /*Output of this Program:- The input string contains vowels.*/
              