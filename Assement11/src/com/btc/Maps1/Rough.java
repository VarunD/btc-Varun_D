package com.btc.Maps1;

import java.util.HashMap;
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

		public static void main(String[] args) 
		{
			Map<Integer, Integer> m = new HashMap<>();
			m.put(12, 90);
			m.put(35, 90);
			m.put(33, 90);
			m.put(56, 88);
			for(Integer i : m.keySet())
			{
//				System.out.println( i + " "+ m.get(i));
				System.out.println(i +" "+  m.get(i));
			}
//			the above code will print the key along with the values
			
			
//			Map<Integer, Rough> rough = new HashMap<>();
//			Rough r = new Rough(89, "varun");
//			Rough r1 = new Rough(96, "pramod");
//			rough.put(1, r);
//			rough.put(2, r1);
//
//			for(Integer a : rough.keySet())
//			{
//				System.out.println(a +" "+rough.get(a).getName());
//			}
//			int id=1;
//			Rough r5 =rough.get(id);
//			System.out.println(r5);
//			
//			for(Integer i : rough.keySet())
//				System.out.println(i+" "+ rough.get(i));
//			
//			
//			
//			Map<Integer, Integer> m1 = new HashMap<>();
//			m1.put(1, r.getMarks());
//			Adiing the specific elements to the maps

			Map<String , Integer> amap = new HashMap<>();
			
			
			
			
			
			
			
			
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
}