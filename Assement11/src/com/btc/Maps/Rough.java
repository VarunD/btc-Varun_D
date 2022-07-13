package com.btc.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Rough 
{
	private int marks;
	private String name;

	Rough(int marks, String name)
	{
		this.marks=marks;
		this.name=name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() 
	{
		return "Rough [marks=" + marks + ", name=" + name + "]";
	}

		public static void main(String[] args) 
		{
			Map<Integer, Integer> m = new HashMap<>();
			m.put(12, 90);
			m.put(35, 90);
			m.put(33, 90);
			m.put(56, 88);
			
			List<Rough>  a = new ArrayList<>();
			Rough r3 = new Rough(89, "varun");
			Rough r4 = new Rough(96, "pramod");
			
			a.add(r3);
			a.add(r4);
			
			for(Rough i: a)
			{
				System.out.println(i.getMarks());
			}
			
			
			
			for(Integer i : m.keySet())
			{
//				System.out.println( i + " "+ m.get(i));
				System.out.println(i +" "+  m.get(i));
			}
//			the above code will print the key along with the values
			for(Integer j : m.keySet())
			{
				System.out.print(j+" "+m.get(j));
			}
			
			
			System.out.println("==============");
			
			Map<Integer, Rough> rough = new HashMap<>();
			Rough r = new Rough(89, "varun");
			Rough r1 = new Rough(96, "pramod");
			rough.put(1, r);
			rough.put(2, r1);
			
			
			int id=1;
//			Rough r5 =rough.get(id);
//			System.out.println(r5);
//			
			for(Integer i : rough.keySet())
				System.out.println(i+" "+ rough.get(i).getMarks());
//			
//			
//			
//			Map<Integer, Integer> m1 = new HashMap<>();
//			m1.put(1, r.getMarks());
//			Adiing the specific elements to the maps

			Map<String , Integer> amap = new HashMap<>();
			
			
			
			
			
			
			
		}		
}
		