package StreamEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import one.util.streamex.StreamEx;

public class Employee {
	
	String name;
	
	int id;
	
	double salary;
	
	
	Role role;
	
	
	



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}





	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Employee(String name, int id, double salary, Role role) {
		
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.role = role;
	}
	
	
	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", role=" + role + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Role role=new Role("manager");
		Role role1=new Role("Tester");
		role.setRole("Manager");
		
		
		
		Employee user=new Employee("Amitesh",1023,23456,role);
		Employee user1=new Employee("Rakesh",1423,56456,role1);
		
		ArrayList<Employee> emp=new ArrayList<Employee>();
		emp.add(user);
		emp.add(user1);
		
		//emp.stream().map(Employee::getRole).forEach(System.out::println);
		
		StreamEx.of(emp).map(Employee::getName).toList().forEach(System.out::println);;
		
		Map<Role, List<Employee>> map=emp.stream().collect(Collectors.groupingBy(Employee::getRole))	;
		
		
		System.out.println(map);
		
		
		

	}

}
