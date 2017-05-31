package scjp.oops;

public class OverloadingEx2  {
	public static void m1(String s1)
	{
		System.out.println(s1);
	}
	
	public static void m1(String s2,int j,long l)
	{
		System.out.println(s2);
		System.out.println(j);
		System.out.println(l);
	}
	
}
