package scjp.oops;

import java.util.Comparator;

public class EmployeeIDComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		Integer empID1 = e1.getEmpNo();
		Integer empID2 = e2.getEmpNo();
		return(empID1.compareTo(empID2));
		
	}

}
