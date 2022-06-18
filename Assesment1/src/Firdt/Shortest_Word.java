package Firdt;

public class Shortest_Word {

	public static void main(String args[])
	{
	String words[] = {"Atrocity" , "Pensive", "Imperceptible", "Discordant"};

	String small = words[0];
	for(int i=0; i<words.length; i++)
	{
	if(words[i].length()<words.length)
	{
	small = words[i];
	}
	}
	System.out.println("The smallest word is the : " +small); 
	}
}

