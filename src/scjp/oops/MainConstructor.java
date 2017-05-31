package scjp.oops;

public class MainConstructor {

	
	public static void main(String[] args) {
		//ConstructorExample.staticMethod();
		Animal an = new  Animal();
		ConstructorExample  ce = new ConstructorExample(10,20,30,an);
		ce.instanceMethod();
	//	PrivateConstructor pc = new PrivateConstructor(12,25);
		
		//ConstructorExample  ce1 = new ConstructorExample(40,50,60);
	    
	   
	   
	    
	}

}
