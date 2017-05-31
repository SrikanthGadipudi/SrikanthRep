package scjp.oops;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<String>();
		s1.add("Zebra");
		s1.add("Cat");
		Iterator<String> it =  s1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		Set<Employee> e1 = new HashSet<>();
		
		Employee e2 = new Employee("Honey", 1, 5, 2500.25);
		Employee e3 = new Employee("Nayana", 2, 4, 2555.25); 
		e1.add(e2);
		e1.add(e3);	
		Iterator<Employee> it1 = e1.iterator();
		while(it1.hasNext())
		{
			Employee eo = it1.next();			
			System.out.println(eo.getEmpName());
		}
		//System.out.println(e1);
		//System.out.println(e2.equals(e3));	
		//System.out.println(s1);	
		
	}

}
