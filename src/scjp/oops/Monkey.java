package scjp.oops;

public class Monkey extends Animal

{
	public String w1(){
		System.out.println("Sub Class");
		return "Srikanth";
	}
	//we cannot reduce the scope of access modifier from parent to child but we can ioncrease
	protected String w2(){
		System.out.println("Sub Covariant Class");
		return "Srikanth";
	}
	void abs(){
		System.out.println("Overirding abstarct method");
	}
	private void me(){
		System.out.println("Child private method");
	}
	static String se1(){
		System.out.println("Sub Static method");
		return "Sub Statci method";
		}
	public void im2(){
		System.out.println("Monkey sub class method");
	}
	public void dm(){
		System.out.println("Unique monkey method");
		
	}
}
