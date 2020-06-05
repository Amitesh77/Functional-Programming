package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String,Integer> l=new TreeMap<String,Integer>((e1,e2)->-e1.compareTo(e2));
		l.put("Amitesh",101);
		l.put("Piu",102);
		l.put("Rahul",204);
		l.put("Abhi",789);
		l.put("Deepak",765);
		
		
		;
		
		//Map<String,Integer> m2=l.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		Map<String,Integer> m3=l.entrySet().stream().sorted(Map.Entry.comparingByValue())
								.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e2,LinkedHashMap::new));
		System.out.println(m3);

	}

}
