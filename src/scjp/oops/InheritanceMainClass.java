package scjp.oops;

public class InheritanceMainClass {

	public static void main(String[] args) {
		Monkey m1=new Monkey();
		m1.im2();
		m1.im1();
		Animal am1 = new Animal();
		am1.im1();
    	Animal am2 = new Monkey();
		am2.im1();
        Monkey m2=(Monkey) am2;
        m2.im1();
        m2.im2();
        Dog d = new Dog();
        d.dm();
        d.ame();
        d.dm1();
	}

}
