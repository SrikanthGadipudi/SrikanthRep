package scjp.oops;

public class OverloadingEx3 {
	public void a1(int i)
	{
		System.out.println("int method");
	}
	public void a1(float f)
	{
		System.out.println("Float method");
	}

	public static void main(String[] args)
	{
		OverloadingEx3 m1 = new OverloadingEx3();
		m1.a1('c');
		m1.a1(1234l);
		
	}
	 }
