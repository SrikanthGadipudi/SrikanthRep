package scjp.oops;

public class Hello {
	String title;
	int value;
	public Hello(){
		title=title+"world";
	}

	public Hello(int value){
		this.value=value;
		title="hello";
		//Hello();
	}
	public static void main(String args[]){
		Hello c= new Hello(5);
		System.out.println(c.title);
		
	}
	
}
