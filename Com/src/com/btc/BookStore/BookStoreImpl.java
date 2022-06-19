package com.btc.BookStore;

public class BookStoreImpl 
{

	public static void main(String[] args) 
	{
		Book b = new Book();
		b.setAuthor("kuvempu");
		System.out.println(b.getAuthor());
		
		b.setBookName("Ramayana");
		System.out.println(b.getBookName());
		
		b.setGenre("mytho");
		System.out.println(b.getGenre());
		
		b.setIsbnNo(20);
		System.out.println(b.getIsbnNo());
		
		b.setPrice(2000);
		System.out.println(b.getPrice());
		
		Book b1 = new Book();
		
		b1.setAuthor("chethan");
		System.out.println(b1.getAuthor());
		
		b.setBookName("2 states");
		System.out.println(b.getBookName());
		
		b.setGenre("love");
		System.out.println(b.getGenre());
		
		b.setIsbnNo(20);
		System.out.println(b.getIsbnNo());
		
		b.setPrice(2000);
		System.out.println(b.getPrice());
		
	}

}
