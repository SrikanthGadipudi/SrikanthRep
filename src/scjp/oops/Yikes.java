package scjp.oops;

public class Yikes {
	public static void go(Long l)
	{
		System.out.println("Long");
			}
	public static void go(Short l)
	{
		System.out.println("Short");
			}
	public static void go(int l)
	{
		System.out.println("int");
			}
	public static void main(String[] args)
	{
		short y = 6;
		long z = 7;
		go(y);
		go(z);
		
	}
}
