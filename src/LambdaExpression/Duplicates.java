package LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="Myname is amitesh and i am from bihar";
		
char [] s1=s.toCharArray();
		
		List<Character> l=new ArrayList<Character>();
		
		for (int j = 0; j < s1.length; j++) {
			
			l.add(s.charAt(j));
		}
		
		
		System.out.println(l);
		
		Set<Character> s2=l.stream().filter(i->Collections.frequency(l,i)==2).collect(Collectors.toSet());
		
		
			System.out.println(s2);
		

	}

}
