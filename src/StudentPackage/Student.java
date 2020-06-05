package StudentPackage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
	
	 private String name;
	 
	 private int age;
	 
	 private Address address;
	 
	 private List<MobileNumber> mobilenumber;
	 
	 
	 

	public Student(String name, int age, Address address, List<MobileNumber> mobilenumber) {
		
		this.name = name;
		this.age = age;
		this.address = address;
		this.mobilenumber = mobilenumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<MobileNumber> getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(List<MobileNumber> mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + ", mobilenumber=" + mobilenumber
				+ "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Student s1=new Student("Amitesh",27,new Address("560067"),Arrays.asList(new MobileNumber("9940084807"),new MobileNumber("4444")));
		
		Student s2=new Student("Priyanka",30,new Address("450098"),Arrays.asList(new MobileNumber("7895182697"),new MobileNumber("7867")));
		
		Student s3=new Student("Abhimanyu",32,new Address("45678"),Arrays.asList(new MobileNumber("785634698"),new MobileNumber("1234")));
		
		Student s4=new Student("Ravi",37,new Address("43567"),Arrays.asList(new MobileNumber("897654342"),new MobileNumber("7654")));
		
		Student s5=new Student("Saurabh",39,new Address("34568"),Arrays.asList(new MobileNumber("9078564534"),new MobileNumber("9087")));
		
		Student s6=new Student("Rohit",50,new Address("89765"),Arrays.asList(new MobileNumber("7856454323"),new MobileNumber("2865")));
		
		
		List<Student> student=Arrays.asList(s1,s2,s3,s4,s5,s6);
		
		List<Student> s=student.stream().filter(e->e.getName().startsWith("R") && e.getAge()==50).collect(Collectors.toList());
		
		for (Student student2 : s) {
			
			
			System.out.println(student2);
		}
		
		
		//get names as String
		
		
		List<String>  names=student.stream().map(Student::getName).collect(Collectors.toList());
		
		String allnames=student.stream().map(Student::getName).collect(Collectors.joining(",","[","]"));
		
		
		System.out.println(allnames);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
