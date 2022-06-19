package Maps;

import java.util.*;

public class Maps1 
{
	public static Map<Character, Integer> counts(String st)
	{
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0; i<st.length(); i++)
		{
			char ch = st.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
				map.put(ch,1);
		}
		return map;
	}

public static void main(String[] args) 
{
	String st="hello world";
	Map<Character, Integer> m = counts(st);
	System.out.println(m);
}

}
