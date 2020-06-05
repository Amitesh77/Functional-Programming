package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test2 {
	
	String name;
	int id;
	
	

	public Test2(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	
	

	@Override
	public String toString() {
		return "Test2 [name=" + name + ", id=" + id + "]";
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ArrayList<Test2> l=new ArrayList<>();
		populate(l);
		
		
		Consumer<Test2> c=e->System.out.println(e);
		
		Predicate<Test2> p=(e)->e.name.length()>=5;
		
		for (Test2 test2 : l) {
			
			
			if(p.test(test2))
			{
				c.accept(test2);
			}
			
		}

	}
	
	
	public static void populate(ArrayList<Test2> l)
	{
		l.add(new Test2("Amitesh",28));
		l.add(new Test2("Piu",28));
		
		l.add(new Test2("Abhi",29));
		l.add(new Test2("Abhi",30));
		
		
	}

}
