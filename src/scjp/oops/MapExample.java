package scjp.oops;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer,String> m = new HashMap<Integer,String>();
		Map<Employee,Department> e = new HashMap<Employee,Department>();
		m.put(1, "Srikanth");
		m.put(2, "Boby");
		m.put(2, "Sri");
		m.put(3, "Boby");
		Employee e1 = new Employee("Nayana", 0, 5, 2500.234);
		Employee e2 = new Employee("Honey", 0, 4, 9500.234);
		Department d1= new Department();
		d1.setDepId(2);
		d1.setDepName("IT");
		Department d2= new Department();
		d2.setDepId(3);
		d2.setDepName("NON IT");
		e.put(e1, d1);
		//e.put(e1, d2);
		//e.put(e2, d1);
		e.put(e2, d2);
		Set<Entry<Integer, String>> m1 = m.entrySet();
		for(Map.Entry<Integer,String> m2:m1){
			Integer i1 = m2.getKey();
			String i2 = m2.getValue();
			System.out.println(i1+ " " + i2);
			
		}
		Set<Employee> se = e.keySet();
		for(Employee se1:se)
		{
			Department de = e.get(se1);
			System.out.println(se1.getEmpName());
			System.out.println(de.getDepName());
		}
	    

	}

}
