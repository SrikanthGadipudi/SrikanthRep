package scjp.oops;

public class ConstructorEx1 {
	

	public static void main(String[] args) {
		Employee emp = new Employee("Srikanth",63270, 36, 70000.000);
		Employee emp1 = new Employee();
        System.out.println(emp.getEmpNo()+ "emp1"+ emp1.getEmpNo());
        emp1.setEmpNo(63271);
        System.out.println(emp.getEmpNo()+ "emp1"+ emp1.getEmpNo());
        
        
	}

}
