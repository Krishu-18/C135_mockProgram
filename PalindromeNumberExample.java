import java.util.Scanner;

public class PalindromeNumberExample {

    // Function to check if a number is a palindrome
    static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting range: ");
        int startRange = scanner.nextInt();

        System.out.print("Enter the ending range: ");
        int endRange = scanner.nextInt();

        int palindromeCount = 0;

        for (int i = startRange; i <= endRange; i++) {
            if (isPalindrome(i)) {
                System.out.println(i + " is a palindrome.");
                palindromeCount++;
            }
        }

        System.out.println("Total number of palindromes between " + startRange + " and " + endRange + ": " + palindromeCount);
    }
}
