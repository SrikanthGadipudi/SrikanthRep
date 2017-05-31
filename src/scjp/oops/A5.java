package scjp.oops;

 class Z {
	public String s = "A";
	public String getName()
	{
		return s;
	}
    public String greeting()
    {
    	return "Class A";
    }
}

 class B5 extends Z
 {
	 public String name = "B";
	 public String greeting()
	 {
		 return "Class B";
	 }
 }
public class A5
{
	public static void main(String[] args)
	{
		Z z = new Z();
		Z z1 = new B5();
		System.out.println(z.greeting() + " HAS NAME  " + z.getName());
		System.out.println(z1.greeting() + " HAS NAME " + z1.getName());
	}
}
