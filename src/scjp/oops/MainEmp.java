package scjp.oops;

public class MainEmp {

	public static void main(String[] args) {
		Emp1 e1 = new Emp1();
		
		e1.setEmpNo(11);
		e1.setEmpName("Srikanth");
		e1.setEmpAge(37);
		Emp1 e2 = new Emp1();
		e2.setEmpNo(11);
		e2.setEmpName("Srikanth");
		e2.setEmpAge(37);
		System.out.println(e1.equals(e2));
        
	}

}
