package StreamEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import one.util.streamex.StreamEx;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="sdf12hbdg6tft56";
		
		Integer arr[]= {1,1,2,3,4,51,2,3,45};
		
		List list=Arrays.asList(arr);
		
		HashSet<Integer> set=(HashSet<Integer>) list.stream().filter(i->Collections.frequency(list, i)==1).collect(Collectors.toSet());
		
		for (Integer integer : set) {
			System.out.println(integer);
		}
//		
//				char[]c;
//				c=s.toCharArray();
//				
//				ArrayList l=new ArrayList();
//				
//				//List l2=Arrays.asList(new Integer(),new Character());
//				
//				//List<Integer> l1=StreamEx.of(l2).select(Integer.class).toList();
		
//		HashMap<Integer,Integer> map=new HashMap();
//		
//		for (int i = 0; i < arr.length; i++) {
//			
//			if(map.containsKey(arr[i]))
//			{
//				map.put(arr[i], map.get(arr[i])+1);
//			}
//			
//			else
//			{
//				map.put(arr[i], 1);
//			}
//	
//		}
//		
//		Set<Integer> set=map.keySet();
//		
//		for (Integer integer : set) {
//			
//			if(map.get(integer)==1)
//			{
//				System.out.println(integer);
//			}
//			
//		}
				
				
				
		//System.out.println(l1);
				
				
				
				
				
	}

}
