package LambdaExpression;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Member {
	
	public String name;
	public int salary;
	
	
	

	public Member(String name, int salary) {
		
		this.name = name;
		this.salary = salary;
	}
	
	
	




	@Override
	public String toString() {
		return "Member [name=" + name + ", salary=" + salary + "]";
	}







	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Member> l1=new ArrayList<Member>();
		
		Predicate<Member> p1=i->i.salary>50000;
		
		populate(l1);
		
		
		Function<Member,Member> f1=e1->{
			
			e1.name=e1.name+"Sharma";
			
			return e1;
			
			
		};
		
		ArrayList<Member> l2=new ArrayList<Member>();
		
		
		for (Member member : l1) {
			
			if(p1.test(member))
			{
				l2.add(f1.apply(member));
			}
			
			
		}
		
		System.out.println(l2);
		
		

	}
	
	
	

	public static void populate(ArrayList<Member> l)
	{
		
		l.add(new Member("Amitesh",30000));
		l.add(new Member("Rahul",50000));
		l.add(new Member("Piu",72345));
		
	}

}
