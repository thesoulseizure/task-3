package Task3;

import java.util.Scanner;

// creating a class Book
public class Book {
	// creating the attributes
	private int bookId;
	private String author;
	private String title;
	private boolean isAvailable;
	
	// creating default constructor
	public Book() {
		super();
	}
	
	// creating parameterized constructor
	public Book(int bookId, String author, String title, boolean isAvailable) {
		super();
		this.bookId = bookId;
		this.author = author;
		this.title = title;
		this.isAvailable = isAvailable;
	}

   // creating getters and setters
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	// creating a method bookMenu
	public void bookMenu() {
		Scanner sc = new Scanner(System.in);
	    System.out.println("1: Enter Id of a Book : ");
	 
	    this.bookId = sc.nextInt();
	    System.out.println("2: Enter Book Author : ");
	  
	    this.author = sc.next();
	    System.out.println("3: Enter Book Title : ");
	  
	    this.title = sc.next();
	   
	}

    // creating toString
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", author=" + author + ", title=" + title + "]";
	}
	
	
	
	
}
