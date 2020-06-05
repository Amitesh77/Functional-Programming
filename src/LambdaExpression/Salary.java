package LambdaExpression;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Function;

public class Salary {
	
	public String name;
	
	public int salary;
	
	
	
	
	
	

	public Salary(String name, int salary) {
		
		this.name = name;
		this.salary = salary;
	}







	@Override
	public String toString() {
		return "Salary [name=" + name + ", salary=" + salary + "]";
	}







	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Salary> l1=new ArrayList<Salary>();
		
		populate(l1);
		
		 
		Function<ArrayList<Salary>,Integer> f1=i->{
			
			 int Totalsalary	=0;
		 
			for (Salary s1 : l1) {
				
				Totalsalary=Totalsalary+s1.salary;
			}
			
		 return Totalsalary;
		};
		
		System.out.println(f1.apply(l1));
		
		

	}
	
	
	
	
	public static void populate(ArrayList<Salary> l)
	{
		
		l.add(new Salary("Amitesh",30000));
		l.add(new Salary("Rahul",50000));
		l.add(new Salary("Piu",72345));
		
	}

}
