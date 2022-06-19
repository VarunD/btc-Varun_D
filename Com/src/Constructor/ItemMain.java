package Constructor;

public class ItemMain {

	public static void main(String[] args) 
	{
	Item item1 = new Item(100, "AC", 3000.34f);
	Item item2 = new Item(101, "Camera", 4000.34f);
	Item item3 = new Item(100, "Mobile", 5000.34f);
	Item item4 = new Item(100, "Regrigerator", 6000.34f);
	Item item5 = new Item(100, "Oven", 2000.34f);
	
	Item items[] = {item1, item2, item3, item4, item5};
	
	for(Item item:items)
	{
		System.out.println(item);
	}
	float max = items[0].getPrice();
	for(int i=0; i<items.length; i++)
	{
		if(items[i].getPrice()>max)
		{
			max = items[i].getPrice();
		}
	}
	System.out.println("The maximum price is the: " +max );
	
	}

}
