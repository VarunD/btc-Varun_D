package com.btc.BookStore;

public class Bookstore 
{
	String bookStoreName;
    String bookStoreId;
    Book[] books;
    public Bookstore(String bookStoreName, String bookStoreId, Book[] books) {
        this.bookStoreName = bookStoreName;
        this.bookStoreId = bookStoreId;
        this.books = books;
    }
	public String getBookStoreName() {
		return bookStoreName;
	}
	public void setBookStoreName(String bookStoreName) {
		this.bookStoreName = bookStoreName;
	}
	public String getBookStoreId() {
		return bookStoreId;
	}
	public void setBookStoreId(String bookStoreId) {
		this.bookStoreId = bookStoreId;
	}
	public Book[] getBooks() {
		return books;
	}
	public void setBooks(Book[] books) {
		this.books = books;
	}
	
	 public float calculateDiscount(Book book,float discountPercentage)
	    {
	        return -1;
	    }
}
