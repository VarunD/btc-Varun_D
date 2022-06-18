package com.btc.Inheritence;

public class Item_main 
{
	public static void main(String[] args) 
	{
	Item item = new Book(1, 2, "Darwin");
//	System.out.println(item.getIdentification_number());
//	System.out.println(item.getNum_of_copies());
//	System.out.println(item.getAuthor());
	item.print();
	item.checkIn();
	item.checkOut();
	item.addItem();
	System.out.println("==========journal paper====================");
	JournalPaper j = new JournalPaper(10, 20, "Varun");
	j.setPub_year(2020);
//	System.out.println(j.getNum_of_copies());
//	System.out.println(j.getIdentification_number());
//	System.out.println(j.getAuthor());
	item.print();
	item.checkIn();
	item.checkOut();
	item.addItem();
	
	System.out.println("=========video============");
	Video v = new Video(1,2, "neel", "action", 2020);
	System.out.println(v.getIdentification_number());
	System.out.println(v.getNum_of_copies());
	System.out.println(v.getYear());
	System.out.println(v.getDirector());
	System.out.println(v.getGenre());
	v.print();
	v.checkIn();
	v.checkOut();
	v.addItem();
	System.out.println("============cd==============");
	
	Cd m = new Cd(1, 2, "abc", "fiction");
	System.out.println(m.getIdentification_number());
	System.out.println(m.getNum_of_copies());
	System.out.println(m.getArtist());
	System.out.println(m.getGenre());
	}

}
