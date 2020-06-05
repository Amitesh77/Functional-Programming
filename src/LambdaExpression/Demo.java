package LambdaExpression;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class  Demo {
	
	
	public static void secondMax(int a[],int total)
	{
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		      // return a[total-2];  
	}

	

	public static void main(String[] args) {
		
		int ar[]= {2,99,5,6,7,89};
		
		
		secondMax(ar,ar.length);
		
		
for (int i = 0; i < ar.length; i++) {
	
	System.out.println(ar[i]);
}

}
	
}
