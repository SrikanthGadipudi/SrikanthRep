package scjp.oops;

public class OverloadingEx4 {
	
	public void m1(String s){
		System.out.println("String Version");
	}
	public void m1(Object o){
		System.out.println("Object Version");
	}
//	public void m1(StringBuffer s){
//		System.out.println("String Buffer Version");
//	}
	public void m2(Animal a){
		System.out.println("Super Class");
	}
	public void m2(Monkey a){
		System.out.println("Sub Class");
	}
	public static void main(String[] args) {
		OverloadingEx4 o1 = new OverloadingEx4();
		o1.m1("Srikanth");
		o1.m1(new Object());
		o1.m1(new StringBuffer("Hello"));
		o1.m1(null);
		Animal an = new Animal();
		Monkey mn = new Monkey();
		Animal an1 = new Monkey();		
		o1.m2(an);
		o1.m2(mn);
		o1.m2(an1);
		
	}

}
