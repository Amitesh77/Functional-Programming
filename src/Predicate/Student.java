package Predicate;

import java.util.ArrayList;
import java.util.function.Function;

import LambdaExpression.SalaryIncrement;

public class Student {
	
	String name;
	int roll;
	float salary;
	
	
	
	

	public Student(String name, int roll, float salary) {
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
		
		
		ArrayList<Student> l1=new ArrayList<Student>();
		
		populate(l1);
		
		Function<Student,Student> f1=(a)->{ a.salary=a.salary+7000;
		
		return a;

		};
		
		ArrayList<Student> l2=new ArrayList<Student>();
		
		for (Student student : l1) {
			
			
			l2.add(f1.apply(student));
		}
		
		
		System.out.println(l2);
		
		
		

	}
	
	public static void populate(ArrayList<Student> l)
	{
		
		l.add(new Student("Amitesh",101,30000));
		l.add(new Student("Rahul",201,50000));
		l.add(new Student("Piu",301,72345));
		
	}

}
