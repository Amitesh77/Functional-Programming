package lambdaTimBucchake;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;

import Predicate.Student;

public class Employee {
	
	String name;
	int roll;
	float salary;
	
	
	
	

	public String getName() {
		return name;
	}



	public int getRoll() {
		return roll;
	}



	public float getSalary() {
		return salary;
	}



	public Employee(String name, int roll, float salary) {
		this.name = name;
		this.roll = roll;
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Employee> l1=new ArrayList<Employee>();
		
		populate(l1);
		
		Function<Employee,Employee> f1=(a)->{ a.salary=a.salary+7000;
		
		return a;

		};
		
		ArrayList<Employee> l2=new ArrayList<Employee>();
		
		for (Employee student : l1) {
			
			
			l2.add(f1.apply(student));
		}
		
		
		l2.stream().sorted(Collections.reverseOrder(Comparator.comparing(Employee::getSalary)).thenComparing(Employee::getName).thenComparing(Employee::getRoll)).collect(Collectors.toList()).forEach(System.out::println);
		
		
		

	}
	
	public static void populate(ArrayList<Employee> l)
	{
		
		l.add(new Employee("Amitesh",101,30000));
		l.add(new Employee("Amitesh",201,30000));
		l.add(new Employee("Piu",301,72345));
		
	}

}
