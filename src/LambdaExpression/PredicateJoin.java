package LambdaExpression;

import java.util.function.Predicate;

public class PredicateJoin {
	
	public static void check(Predicate<Integer> p,int[]a)
	{
		for (int i : a) {
			
			if(p.test(i))
			{
				System.out.println(i);
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,3,6,8,12,45,60,56,78,66,77,11,33,55};
		
		Predicate<Integer> p1=i->i>10;
		
		Predicate<Integer> p2=i->i%2==0;
		
		//check(p1,a);
		
		//negation
		
		//check(p1.negate(),a);
		
		//even
		
		//check(p2,a);
		
		//odd
		
		System.out.println("/n");
		
		
		//check(p2.negate(),a);
		
		
		check(p1.and(p2),a);
		

	}

}
