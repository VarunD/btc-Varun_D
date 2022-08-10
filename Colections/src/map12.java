import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class map12 
{
public static void main(String[] args) {
	Person p = new Person("varun", 1, "java");
	Person p1 = new Person("bhuvi", 2, "python");
	Person p2 = new Person("sanjay", 3, "java");
	
	List<Person> l1 = new ArrayList<>();
	l1.add(p1);
	l1.add(p2);
	l1.add(p2);
	for(Person i : l1)
	{
		System.out.println(i.getName());
	}
	
	HashSet<Person> hash = new HashSet<>();
	hash.add(p);
	hash.add(p2);
	
	
	for(Person i : hash)
	{
		System.out.println(i.getCourse());
	}
	System.out.println("2nd after.......");
	hash.forEach(i->System.out.println(i));
	
//	TreeSet<Person> t = new TreeSet<>();
//	t.add(p);
//	t.add(p1);
//	t.add(p2);
	
//	for(Person i : t)
//	{
//		System.out.println(i.getAge());
//	}
}
}