package scjp.oops;

import java.util.Iterator;
import java.util.List;

public class EmployeeSub extends DepartmentSuper {
	/*
	 *Overiridng example
	 *Private methods can not override as scope of the private methods will be 
	 limited to that class
	 *final methods can not override from parent to child as the 
	 implementations should not change for final methods
	  * Abstract methods can be overridden as non abstract from parent to child
	  * Non abstract to abstract can be overridden from parent to child
	  * we can not reduce the scope of access modifiers but we can increase
	  * public --> public 
	  * protected --> public or protected
	  * default -> public or protected or default
	  * Child class throws exception then parent class also should throw the same or super class exception
	  * Static methods can not override
	  * 
	 */
	
	public void empDetails(List<Employee> empDetails){
		
		Iterator<Employee> ite = empDetails.iterator();
		
		while(ite.hasNext()){
			
		//String	obj = (String)ite.next();
		
			Employee emp= (Employee) ite.next();
			System.out.println("Sub Employee Name"+emp.getEmpName());
			
		}
		
	}
	
	
	/**
	 * 
	 * covariant overirding example
	 * Covariant return types applicable only for object types not for primitives
	 * String,StringBuffer,StringBuilder --> Object super class
	 * INTEGER,BYTE -->NUMBER
	 */
	
	public final String add(String i,String j){
		String conc = i+j;
		System.out.println("Sub Class Add" + conc);
		return conc;
	}
	
	public static void stringReverse(String rev){
		 StringBuffer revString = new StringBuffer(rev);
		 String revStr = new String(revString.reverse());
		 System.out.println("Sub String Revrese"+ revStr);
	}


}
