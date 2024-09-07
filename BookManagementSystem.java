package Task3;

import java.util.Scanner;
// creating a class that has main method
public class BookManagementSystem {
	    public static void main(String[] args) {
	        Library library = new Library();

	      
	        do {
	            library.displayMainMenu();
	            Scanner sc = new Scanner(System.in);
	            System.out.println("Enter your choice: ");
	            System.out.println("******************************");
	            int choice = sc.nextInt();
	            if (choice == 1) {
	                Book book = new Book();
	                book.bookMenu();
	                library.addBook(book);
	            }else if (choice == 2) {
	                System.out.println("Enter the books id that you want to search : ");
	                int userChoice = sc.nextInt();
	                int indexUser = library.findBook(userChoice);
	                System.out.println("The book with the given id is: " + "\r\n" + library.getBook(library.findBook(userChoice)));
	            }else if (choice == 3) {
	                System.out.println("Enter the books Id Number that you want to Delete : ");
	                int userChoice = sc.nextInt();
	                Book book = library.getBook(library.findBook(userChoice));
	                library.removeBook(book);
	            } else if(choice == 4) {
	                library.getAllBook();
	            }
	        } while (true); 
	  }
	}


