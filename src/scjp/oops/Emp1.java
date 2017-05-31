package scjp.oops;

public class Emp1 {
	
	private int empNo;
	private int empAge;
	private String empName;
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public boolean equals(Object o)
	{
		if(o==null){
			return false;
		}
		if(o instanceof Emp1)	{
		
		Emp1 e = (Emp1) o;
		if(this.empName.equals(e.empName))
		{
		return true;
		}
		else{
			return false;
		}
		
	}else{
		return false;
	}
	
}
}
	
	
