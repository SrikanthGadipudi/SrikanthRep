package scjp.oops;

public  class Animal {
	
	public String w1(){
		System.out.println("Super Class");
		return "Str";


	}
	static String se1(){
		System.out.println("Super Static method");
		return "Srikanth";
	}
	Object w2(){
		System.out.println("Super Covariant Class");
		return "Str";

 
	}
	//abstract void abs();
	// final method cannot iverride
	final String w3(){
		System.out.println("Super Covariant Class");
		return "Str";

 
	}	
	
	private void me(){
		System.out.println("Private method");
		
	}
	
	public void im1(){
		System.out.println("Super Class Method");
	}
	public void ame(){
		System.out.println("Unique Animal Method");
	}
	
}
