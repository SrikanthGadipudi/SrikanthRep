package scjp.oops;

public class Beta extends Alpha
{
public void foo(String a)
{
	System.out.println("BETA Foo");
}
public void bar(String a)
{
	System.out.println("BETA Bar");
}
public static void main(String[] args)
{
	Alpha a = new Beta();
	Beta b = (Beta)a;
	Alpha a1 = new Alpha();
	Beta b1 = new Beta();
	
	a.foo("Srikanth");
	a.bar("Boby");
	b.foo("s1");
	b.bar("s2");
	a1.foo("parent");
	a1.bar("parent1");
	b1.foo("child");
	b1.bar("child");
}
}