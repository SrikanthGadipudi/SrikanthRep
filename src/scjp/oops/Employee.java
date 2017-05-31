package scjp.oops;

public class Employee implements Comparable<Object> {
	
private String empName;
private Integer empNo;
private Integer empAge;
private Double empSal;


public Employee()
{
	System.out.println("Dummy Constructor");
}

public Employee(String empName,Integer empNo,Integer empAge,Double empSal)
{
	this.empName = empName;
	this.empNo = empNo;
	this.empAge = empAge;
	this.empSal = empSal;
	System.out.println("Four Arguements Constructor");
	
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public Integer getEmpNo() {
	return empNo;
}

public void setEmpNo(Integer empNo) {
	this.empNo = empNo;
}

public Integer getEmpAge() {
	return empAge;
}

public void setEmpAge(Integer empAge) {
	this.empAge = empAge;
}

public Double getEmpSal() {
	return empSal;
}

public void setEmpSal(Double empSal) {
	this.empSal = empSal;
}
public boolean equals(Object o)
{
	if(o==null){
		return false;
	}
	if(o instanceof Employee)	{
	
	Employee e = (Employee) o;
	if((this.empName.equals(e.empName))&&(this.empNo.equals(e.empNo))
			&&(this.empAge.equals(e.empAge))&&(this.empSal.equals(e.empSal)))
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
public int hashCode(){
	
	
	return empName.hashCode()*empNo.hashCode()*empSal.hashCode()*empAge.hashCode();
	
	
	
}


@Override
public int compareTo(Object o) {
	Employee e = (Employee) o;
	String eName = this.empName;
	String eName1 = e.empName;
	int i =eName.compareTo(eName1);
	System.out.println("this . eName" +eName 
			+ "new eName1" + eName1 +"return value" + i);
	
	return i;
	
	
}




}
