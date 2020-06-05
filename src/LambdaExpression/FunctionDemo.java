package LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionDemo {
	
	public String name;
	
	public int marks;
	
	
	
	

	public FunctionDemo(String name, int marks) {
		
		this.name = name;
		this.marks = marks;
	}

	



	@Override
	public String toString() {
		return "FunctionDemo [name=" + name + ", marks=" + marks + "]";
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<FunctionDemo> l1=new ArrayList<FunctionDemo>();
		
		populate(l1);
		
		Function<FunctionDemo,String> f=s->
		{
			int marks=s.marks;
			
			if(marks>90)
			{
				return "Awesome";
			}
			
			else if(marks>=50 && marks<=90)
			{
				return "Good";
			}
			
			else
				return "Try Harder";
		};
		
		
		
	Consumer<FunctionDemo> c=c1->{
		
		
		System.out.println("Name  : "+c1.name);
		System.out.println("Marks   :"+c1.marks);
		
		System.out.println("Grade  :"+f.apply(c1));
		
		
	};
	
	
	for (FunctionDemo functionDemo : l1) {
		
		c.accept(functionDemo);
	}
		
		
		
		
		
		
		
		
		
	}
		
		public static void populate(List<FunctionDemo> l)
		{
			
			
			l.add(new FunctionDemo("Amitesh",67));
			l.add(new FunctionDemo("Amitesh",79));
			l.add(new FunctionDemo("Amitesh",23));
			l.add(new FunctionDemo("Amitesh",49));
			l.add(new FunctionDemo("Amitesh",99));
		}
		

	

}
