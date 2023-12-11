package LabWork;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PositiveNumberCheck {
    public static void main(String[] args) {
        try {
            // Specify the file path to read numbers from.
            String filePath = "D:\\File/Number.txt";

            // Open the file for reading.
            Scanner fileScanner = new Scanner(new File(filePath));

            while (fileScanner.hasNext()) {
                int number = fileScanner.nextInt();

                if (number > 0) {
                    throw new PositiveNumberException("Positive number found: " + number);
                }
            }

            // Close the file after processing.
            fileScanner.close();

            System.out.println("All numbers are non-positive.");
           } 
         catch (FileNotFoundException e) {
            // Handle file not found exception.
            System.err.println("File not found: " + e.getMessage());
          }
         catch (PositiveNumberException e) {
            // Handle the custom exception for positive numbers.
            System.err.println("Exception: " + e.getMessage());
        }
    }
}

// Custom exception class for positive numbers.
class PositiveNumberException extends Exception {
    public PositiveNumberException(String message) {
        super(message);
    }
}


       /*Output of this Program:-Exception: Positive number found: 123456*/
      
