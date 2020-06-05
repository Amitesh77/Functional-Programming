package practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Employee {
	
	String name;
	int age;
	
	
	
	
	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}
	
	

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Employee> l1=new ArrayList<Employee>();
		
		
		populate(l1);
		
		
		List<Employee> l2=l1.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getAge)).collect(Collectors.toList());
		
		

		for (Employee employee : l2) {
			
			System.out.println(employee);
		}
		
			
			
			
			
		

	}
	
	



	public static void populate(ArrayList<Employee> l)
	{
		l.add(new Employee("Amitesh",28));
		l.add(new Employee("Piu",28));
		
		l.add(new Employee("Abhi",29));
		l.add(new Employee("Abhi",30));
		
		
	}

}
