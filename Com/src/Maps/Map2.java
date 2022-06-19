package Maps;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
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
				map.put(ch, 1);
		}
		for(Character i : map.keySet())
		{
			System.out.println(i +" "+ map.get(i));
		}
		return map;
}
	public static void main(String[] args) {
		String st ="hello world";
		counts( st);
	}
}