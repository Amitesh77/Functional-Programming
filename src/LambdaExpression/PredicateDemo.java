package LambdaExpression;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<EmployeeSorting> l1=new ArrayList<>();
		
		Predicate<String> p=s->s.length()>8;
		
		System.out.println(p.test("Amiteshhh"));
		
		

	}

}
