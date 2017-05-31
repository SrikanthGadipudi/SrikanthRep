package scjp.oops;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		SortedSet<String> ss1 = new TreeSet<String>();		
		ss1.add("Abraham");
		ss1.add("Don");
//		SortedSet<StringBuffer> sb1 = new TreeSet<StringBuffer>();
//		sb1.add(new StringBuffer("Boby"));
		System.out.println(ss1);
			
		
     SortedSet<Employee> se1 = new TreeSet<Employee>();
   	 Employee e1 = new Employee();
   	 e1.setEmpNo(14);
   	 e1.setEmpName("Sri");
   	 e1.setEmpAge(15);
   	 e1.setEmpSal(1234.87);
   	 Employee e2 = new Employee();
   	 e2.setEmpNo(13);
   	 e2.setEmpName("Teja");
   	 e2.setEmpAge(13);
    e2.setEmpSal(1237.87);
  	 Employee e3 = new Employee();
  	e3.setEmpNo(11);
  	e3.setEmpName("Zani");
  	e3.setEmpAge(13);
  	e3.setEmpSal(1237.87);
   	 se1.add(e1);
   	 se1.add(e2);
     se1.add(e3);
   	 System.out.println(se1);
   	 for(Employee se11 : se1){
   	 System.out.println(se11.getEmpName());
   	 
   	 //Comparator Example
   	 Comparator eic = new EmployeeIDComparator();
   	 SortedSet<Employee> sc = new TreeSet<Employee>(eic);
   	 
   	 sc.add(e1);
   	 sc.add(e2);
   	 sc.add(e3);
   	 for(Employee sd : sc)
   	 {
   		 System.out.println(sd.getEmpName());
   	 }
   		 
   	 }
	}

}
