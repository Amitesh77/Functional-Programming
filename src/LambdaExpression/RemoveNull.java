package LambdaExpression;

import java.util.function.Predicate;

public class RemoveNull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s= {"Amitesh",null,"","Ravi","","    "};
		
		
		Predicate<String> p1=i->i!=null && i.length()!=0;
		
		
		for (String s1 : s) {
			
			if(p1.test(s1))
			{
				System.out.println(s1);
			}
			
		}

	}

}
