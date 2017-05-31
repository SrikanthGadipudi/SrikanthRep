package scjp.oops;

public class Sample {
	public static void main(String[] args){
		
		B b=new B();
		System.out.println(b.doIt());
		b.doIt().doSomething("s");
	}

}
