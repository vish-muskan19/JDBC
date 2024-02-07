package tutorial_data;


import java.io.InputStream;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Start {

	public static void main(String[] args) {
		
		System.out.println("Welcome to JDBC");
		System.out.println("Press 1 to add user");
		System.out.println("Press 2 to Read user");
		System.out.println("Press 3 to Update user");
		System.out.println("Press 4 to Delete User");

		Scanner scanner = new Scanner(System.in);

		while (true) {
			int value = scanner.nextInt();
			if (value == 1) {
				// insert into database

				System.out.println("pls enter name");
				String nameString = scanner.next();
				System.out.println("pls enter type");
				String typeString = scanner.next();

				Product product = new Product(nameString, typeString);

				Boolean isTrue = ProductToDatabase.insterTo(product);
				if (isTrue) {
					System.out.println("Sucess");
				} else {
					System.out.println("try again");
				}
			}
			else if (value==2) {
				System.out.println("Selected is read user list");
			     Boolean isDone=	ProductToDatabase.ReadProductList();
			     if (isDone) {
						System.out.println("Sucess");
					} else {
						System.out.println("try again");
					}
				}
			else if (value==3) {
				System.out.println("Update user is selected");
				System.out.println("pls enter id");
				int id = scanner.nextInt();
				System.out.println("pls enter name");
				String name= scanner.next();
				boolean isUpdated=ProductToDatabase.updateProductList(id, name);
				if (isUpdated) {
					System.out.println("Sucess");
				} else {
					System.out.println("try again");
				}				
			}
			else if (value==4) {
				System.out.println("Delete user is selected");
				System.out.println("pls enter id");
				int id = scanner.nextInt();
				boolean isUpdated=ProductToDatabase.delete(id);
				if (isUpdated) {
					System.out.println("Sucess");
				} else {
					System.out.println("try again");
				}				
			}
			else if (value==0) {
				System.out.println("Thanks for using JDBC appliaction");
				break;
			} 
		}
		
		
	}
}