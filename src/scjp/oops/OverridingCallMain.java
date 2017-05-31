package scjp.oops;

public class OverridingCallMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal an = new Animal();
		an.w1();
		an.w3();
		an.se1();
		Monkey mn = new Monkey();
		mn.w1();
		mn.w3();
		mn.se1();
		Animal amn = new Monkey();
		amn.w1();
		amn.w2();
		amn.w3();
		amn.se1();
		
	}

}
