package scjp.oops;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExample {

	public static void main(String[] args) {
	 List<String> l = new ArrayList<String>();
	 List<Employee> e = new ArrayList<Employee>();
	 List<Collection> c = new ArrayList<Collection>();
	 
	 Employee e1 = new Employee();
	 e1.setEmpNo(12);
	 e1.setEmpName("Nani");
	 e1.setEmpAge(15);
	 Employee e2 = new Employee();
	 e2.setEmpNo(13);
	 e2.setEmpName("Teja");
	 e2.setEmpAge(13);
	 Employee e3 = new Employee();
	 e3.setEmpNo(14);
	 e3.setEmpName("Nayana");
	 e3.setEmpAge(4);
	 e.add(e1);
	 e.add(e2);
	// e.add(e3);
	 
	 l.add("Srikanth");
	 l.add("Srilakshmi");
	 l.add(1, "Boby");
	 c.add(e);
	 c.add(l);
	 for(Collection c1:c){
		 for(Object o1:c1){
			 if(o1 instanceof Employee){
				 Employee e4 = (Employee) o1;
				 //System.out.println(e3.getEmpName());
				 if(e4.getEmpNo() == 13)
				 {
					 System.out.println(e4.getEmpName());
				 }
				 
			 }else
			 {
				 String s2 = (String) o1;
				 System.out.println(s2);
				 
			 }
		 }
	 }
	 ListIterator<Employee> it = e.listIterator();
	 while(it.hasNext()){
		Employee e5 =  it.next();
		 e.indexOf(e5);
		 if(e5.getEmpName().equals("Nani")){
		 it.remove(); 
		 it.add(e3);
		 }
	 }
//	 for(Employee e5:e){
//		 System.out.println(e5.getEmpAge());
//		 if(e5.getEmpName().equals("Nani")){
//			 e.remove(e5); 
//			 }
//		
//	 }
	 e.get(1);
	 
	 System.out.println(e);
	 

	 

	}

}
