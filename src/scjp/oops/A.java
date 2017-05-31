package scjp.oops;

public interface A {
	
	public void doSomething(String s);

}

class AImpl implements A {

	@Override
	public void doSomething(String s) {
		// TODO Auto-generated method stub
		System.out.println("ABCD");
	}

}

class B {
	public A doIt() {
		A a = new AImpl();
		return a;
	}

	public Object execute()

	{
		return "";
	}
}

class C extends B {
	public AImpl doIt() {
		AImpl a = new AImpl();
		return a;
	}

	public String execute() {

		return "";
	}
}
