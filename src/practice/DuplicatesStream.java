package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicatesStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Integer [] arr= {1,2,3,4,5,1,2,3,45,2};
		
		
		List<Integer> list=Arrays.asList(arr);
		
		
		list.stream().distinct().forEach(System.out::println);

	}

}
