package scjp.oops;

public class ConstructorExample{
	int a;
	int b;
	int c;
	static int s; 
	final int f=4;
	Animal animal;

	public ConstructorExample(int x,int y,int z,Animal an){
		this(y, z);
		this.a=x;
		this.b=y;
		this.c=z;
		this.animal=an;
		System.out.println(animal);
		
}
	public ConstructorExample(int y,int z){
		super();
		this.b=y;
		this.c=z;
		System.out.println("2 arguement");
		
}
	
	public void instanceMethod(){
		System.out.println("Instance Method");
	}
	public static void staticMethod()
	{
		System.out.println("Static Method");
	}

}
