package LambdaExpression;

import java.util.function.Function;

public class FunctionalDefault {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer> f1=i->i*i;
		
		Function<Integer,Integer> f2=i->i*i*i*i;
		
		
		System.out.println(f1.andThen(f2).apply(2));

	}

}
