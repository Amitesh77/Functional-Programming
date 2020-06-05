package LambdaExpression;

import java.time.LocalDate;
import java.util.Date;
import java.util.function.Supplier;

public class Suplier1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<Thread> d1=()->new Thread();
		
		System.out.println(d1.get());
		
		

	}

}
