package scjp.oops;

import java.util.ArrayList;
import java.util.List;

public class DepartmentSuper {
	public int depId;
	public String depName;
	public List<Employee> employeeList = new ArrayList<Employee>();
	
	public List<Employee> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public void empDetails(List<Employee> empDetails){
		
		System.out.println("Super Class List Size"+empDetails.size());
		
	}
	public Object add(String k,String l){
		String sStr = k.substring(0, 3);
		System.out.println("Super Sub String" + sStr);
		return sStr;
		
	}
	public static void stringReverse(String stab){
		
	    String str = "";
		System.out.println("Super String Reverse Example");
		for(int i=stab.length()-1;i>=0;--i){	
			
			//System.out.println(stab.charAt(stab.length()-i));
			//str = str.concat(String.valueOf(stab.charAt(stab.length()-i)));
			str = str.concat(String.valueOf(stab.charAt(i)));
		}
		System.out.println(str);
	}

}
