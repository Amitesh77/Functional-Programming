package LambdaExpression;
import java.util.function.Function;


public class Functiondem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s= {"Amitesh",null,"","Ravi","","    "};
		
		
		Function<String[],Integer> f1=s1->{
			
		int v=0;
			for(String a:s)
			{
				
				
				System.out.println(a.length());
			}
			return v;
			
		};
		
		
		
			
		

	}

}
