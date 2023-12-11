import java.util.Scanner;

public class DashboardProject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {

            System.out.println("Welcome to Dashboard:");
            System.out.println("=====================");
            System.out.println("1. Select 1 for User");
            System.out.println("2. Select 2 for Product");
            System.out.println("3. Select 3 for Cart");
            System.out.println("4. Select 4 for Order");
            System.out.println("5. Select 5 for Exit");
        
            
            
            choice = scanner.nextInt();

           
            switch (choice) {
                case 1:
                    System.out.println("Case 1 Executed... (User)");
                   
                    break;
                case 2:
                    System.out.println("Case 2 Executed... (Product)");
                 
                    break;
                case 3:
                    System.out.println("Case 3 Executed... (Cart)");
                   
                    break;
                case 4:
                    System.out.println("Case 4 Executed... (Order)");
                   
                    break;
                case 5:
                    System.out.println("Exited Successfully.... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 5);

       
        scanner.close();
    }
}
