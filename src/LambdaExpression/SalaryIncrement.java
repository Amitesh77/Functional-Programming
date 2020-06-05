package LambdaExpression;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;

public class SalaryIncrement {
	
	public String name;
	
	public int salary;
	
	
	
	
	
	

	public SalaryIncrement(String name, int salary) {
		
		this.name = name;
		this.salary = salary;
	}







	@Override
	public String toString() {
		return "Salary [name=" + name + ", salary=" + salary + "]";
	}







	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<SalaryIncrement> l1=new ArrayList<SalaryIncrement>();
		
		populate(l1);
		
		 Predicate<SalaryIncrement> p1=s->s.salary<50000;
		Function<SalaryIncrement,SalaryIncrement> f1=i->{

				i.salary=i.salary+700;
			
			
		 return i;
		};
		
		
		ArrayList<SalaryIncrement> l2=new ArrayList<SalaryIncrement>(); 
		
		for (SalaryIncrement salaryIncrement : l1) {
			
			if(p1.test(salaryIncrement))
			{
				l2.add(f1.apply(salaryIncrement));
			}
			
		}
		
		System.out.println(l2);
		
		
		
		

	}
	
	
	
	
	public static void populate(ArrayList<SalaryIncrement> l)
	{
		
		l.add(new SalaryIncrement("Amitesh",30000));
		l.add(new SalaryIncrement("Rahul",50000));
		l.add(new SalaryIncrement("Piu",72345));
		
	}

}
