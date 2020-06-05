package LambdaExpression;

import java.util.function.Predicate;

public class PredicateName {
	
	public static void checkName(Predicate<String> s,String[] s1)
	{
		
		for (String string : s1) {
			
			if(s.test(string))
			{
				System.out.println(string);
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String []a= {"Amitesh","Rahul","Priyanka","Ravi","Abhimanyu","Rohit","Saurabh"};
		
		int count=0;
		
		Predicate<String> p1=i->i.length()>8;
		
		checkName(p1,a);
		
		
		

	}

}
