package Task3;

// creating a library class
public class Library {
	// creating attributes 
	Book[] books;
	public int count;

    // creating default constructor
	public Library() {
	  
	    books = new Book[5];
	    count = 0;
	}

    // creating a method to count the number of books
	public int countBooks() {
	    return count;
	}

	// creating a method to search a book
	public int findBook(int bookId) {
	    for (int i = 0; i < count; i++) {
	        if (books[i].getBookId() == bookId) {
	            return i;
	        }
	    }
	    return -1;
	}
   // creating a method to get a book
	public Book getBook(int index) {
	    if (index >= 0 && index <= count) {
	        return books[index];
	    }
	    return null;
	}


	// creating a method to add a book
	public boolean addBook(Book b) {
	    if (count < books.length && findBook(b.getBookId()) == -1) {
	        books[count] = b;
	        count++;
	        return true;
	    }
	    return false;

	}

   // creating a book to remove book
	public boolean removeBook(Book b){
	    int index = findBook(b.getBookId());
	    if (index != -1) {
	        for (int i = index; i < (count - 1); i++) {
	            books[i] = books[i+1];
	        }
	        count--;
	        return true;
	    }
	    return false;
	}

   // creating a method to print all the books
	public void getAllBook() {
	    System.out.println("All the book in the system are: " + "\r\n");

	    for(int i = 0; i < count; i++){
	        System.out.println(books[i]);
	        System.out.println("\r\n");
	    }

	}

	// creating a method to display the menu
	public void displayMainMenu(){
	    System.out.println("******************************");
	    System.out.println("   Library Menu   ");
	    System.out.println("1: Add a book.");
	    System.out.println("2: Get a book information.");
	    System.out.println("3: Delete the book.");
	    System.out.println("4: Print all books.");
	    System.out.println("******************************" + "\r\n");
	}
}
