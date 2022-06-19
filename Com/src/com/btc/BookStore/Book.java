package com.btc.BookStore;

public class Book 
{
	 	int isbnNo;
	    private String bookName;
	    private String author;
	    private String genre;
	    private float price;
	    
		public int getIsbnNo() {
			return isbnNo;
		}
		public void setIsbnNo(int isbnNo) {
			this.isbnNo = isbnNo;
		}
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}	

}
