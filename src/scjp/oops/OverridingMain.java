package scjp.oops;

import java.util.ArrayList;
import java.util.List;

public class OverridingMain {

	public static void main(String[] args) {
		List<Employee> li = new ArrayList<Employee>();
	    Employee em = new Employee("Srikanth", 201, 37, 67000.000);
		Employee em1 = new Employee();
		em1.setEmpName("Ravi");
		em1.setEmpNo(203);
		em1.setEmpAge(45);
		em1.setEmpSal(567000.000);
		li.add(em);
		li.add(em1);
	    DepartmentSuper ds = new DepartmentSuper();		
/*		ds.empDetails(li);
	    
		ds.add("Srikanth", "Srilakshmi");*/
		ds.stringReverse("Srikanth");
	    EmployeeSub es = new EmployeeSub();
//        es.empDetails(li);
//        es.add("Srikanth", "Srilakshmi");
        es.stringReverse("Srikanth");
        DepartmentSuper ds1 = new EmployeeSub();
/*        ds1.empDetails(li);
        ds1.add("Srikanth","Srilakshmi");*/
        ds1.stringReverse("Srikanth");
       // EmployeeSub es1 = (EmployeeSub) new DepartmentSuper();
        EmployeeSub es1 = (EmployeeSub) ds1;
/*        es1.empDetails(li);
        es1.add("Srikanth", "Srilakshmi");*/
        es1.stringReverse("Srikanth");
        
	}

}
