package LambdaExpression;

import java.util.ArrayList;
import java.util.function.Function;

public class Employee {
	
	public String name;
	public int id;
	public int salary;
	
	
	
	

	public Employee(String name, int id, int salary) {
		
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	
	
	





	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}









	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> l2=new ArrayList<Employee>();
		
		populate(l2);
		
		
		ArrayList<Employee> l3=new ArrayList<Employee>();
		
		Function<Employee,Employee> f1=e1->{
			
			boolean b1=e1.salary>50000;
			return e1;
			
			
		};
		
		
		for (Employee employee : l2) {
			
			l3.add(f1.apply(employee));
			
		}
		
		System.out.println(l2);

	}
	
	
	
	public static void populate(ArrayList<Employee> l1)
	{
		l1.add(new Employee("Amitesh",12,30000));
		l1.add(new Employee("Rahul",20,5000));
		
		l1.add(new Employee("Ravi",56,67098));
		l1.add(new Employee("Piu",3,69000));
		
		
	}

}
