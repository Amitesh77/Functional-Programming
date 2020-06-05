package LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComaparatorDemo   {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> l1=new ArrayList();
		
		l1.add(20);
		l1.add(200);
		l1.add(40);
		l1.add(70);
		
		
		
		
		Collections.sort(l1,(o1,o2)->(o1>o2)?-1:(o1<o2)?1:0);
		
		System.out.println(l1);
		
		

	}

}
