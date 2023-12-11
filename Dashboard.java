

import java.util.Scanner;

public class Dashboard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option = 0;
		
		do {
			System.out.println("Welcome to Dashboard\n======================");
			System.out.println("1. Select 1 for User \n2. Select 2 for Products \n3. Select 3 for Cart \n4. Select 4 for Order \n5. Select 5 for Exit");
			option = sc.nextInt();
			switch(option) {
			case 1: 
				System.out.println("1. Select 1 Add User \n2. Select 2 Delete User \n3. Select 3 Update User \n4. Select 4 Show All User \n5. Select 5 Show Any User \n6. Select 6 for Exit");
				int userBtn = 0;
				do {
					userBtn = sc.nextInt();
					switch(userBtn) {
					case 1:
						System.out.println("Add User");
						break;
					case 2:
						System.out.println("Delete User");
						break;
					case 3:
						System.out.println("Update User");
						break;
					case 4:
						System.out.println("Show All User");
						break;
					case 5:
						System.out.println("Show Any User");
						break;
					case 6:
						System.out.println("Exited from User Section Successfully...");
						break;
					}
				}while(userBtn != 6);
				break;
			case 2: 
				System.out.println("1. Select 1 Add Product \n2. Select 2 Delete Product \n3. Select 3 Update Product \n4. Select 4 Show All Product \n5. Select 5 Show Any Product \n6. Select 6 for Exit");
				int ProductBtn = 0;
				do {
					ProductBtn = sc.nextInt();
					switch(ProductBtn) {
					case 1:
						System.out.println("Add Product");
						break;
					case 2:
						System.out.println("Delete Product");
						break;
					case 3:
						System.out.println("Update Product");
						break;
					case 4:
						System.out.println("Show All Product");
						break;
					case 5:
						System.out.println("Show Any Product");
						break;
					case 6:
						System.out.println("Exited from Product Section Successfully...");
						break;
					}		
				}while(ProductBtn != 6);
				break;
			case 3: 
				System.out.println("1. Select 1 Add to Cart \n2. Delete from Cart \n3. Select 3 for Exit");
				int cartBtn = 0;
				do {
					cartBtn = sc.nextInt();
					switch(cartBtn) {
					case 1:
						System.out.println("Add to Cart");
						break;
					case 2:
						System.out.println("Delete from Cart");
						break;
					case 3:
						System.out.println("Exited from Cart Section Successfully...");
						break;
					}		
				}while(cartBtn != 3);
				break;
			case 4: 
				System.out.println("1. Select 1 Book an Order \n2. Cancel an Order \n3. Select 3 for Exit");
				int orderBtn = 0;
				do {
					orderBtn = sc.nextInt();
					switch(orderBtn) {
					case 1:
						System.out.println("Book an Order");
						break;
					case 2:
						System.out.println("Cancel an Order");
						break;
					case 3:
						System.out.println("Exited from Order Section Successfully...");
						break;
					}		
				}while(orderBtn != 3);
				break;
			case 5: 
				System.out.println("5. Case 5 Executed \nExited Successfully");
				sc.close();
				System.exit(0);
			}
		}while(option !=5);
	}

}
