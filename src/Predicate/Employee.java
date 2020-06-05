package Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Employee {
	
	
	
	
	
	public static ArrayList<String> checkName(Predicate<String> p,String[] b)
	{
		
		ArrayList<String> l1=new ArrayList<String>(); 
		for (String string : b) {
			
			
			if(p.test(string))
			{
				l1.add(string);
		
				
			}
		}
		
		return l1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		
		String []a= {"Amitesh","Rahul","Priyanka","Ravi","Abhimanyu","Rohit","Saurabh"};
		
		Predicate<String> p=s->s.length()>6;
		Predicate<String>p1=s1->s1.contentEquals("Saurabh");
		
		
		
		
		List<String> list=checkName(p,a);
		
		System.out.println(list);
		
		List<String> list1=list.stream().filter(i->i.length()>7).collect(Collectors.toList());
		System.out.println(list1);
		
		

	}
	
	
	
	
	public static void check(ArrayList<String> l1)
	{
		
	}

}
