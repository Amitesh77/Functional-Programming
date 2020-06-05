package LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSorting {
	
	String name;
	
	int empid;



	public EmployeeSorting(int empid,String name) {
	
		this.name = name;
		this.empid = empid;
	}


	@Override
	public String toString() {
		return "EmployeeSorting [name=" + name + ", Empid=" + empid + "]";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<EmployeeSorting> l1=new ArrayList<>();
		
		l1.add(new EmployeeSorting(45,"Amitesh"));
		l1.add(new EmployeeSorting(70,"Rahul"));
		l1.add(new EmployeeSorting(56,"Piu"));
		
		System.out.println(l1);
		
		
		Collections.sort(l1, (e1,e2)->(e1.empid<e2.empid)?-1:(e1.empid>e1.empid)?1:0);
		
		System.out.println(l1);
		
		

	}


	
	
	
	

}
