package scjp.oops;

public class TypeCastingExample {
	
	//Converting from primitive to wrapper
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Converting from primitive to wrapper
		int i = 10;
		char c = 'a';
		Integer i1 = Integer.valueOf(i);
		Character c1 = Character.valueOf(c);
		
		//Converting from Wrapper to Primitive 
		 Integer a = 23;		 
		 int a1 = a.intValue();
		 
		 //Converting from String to Wrapper and Primitive
		 
		 String s = "99";
		 int s1 = Integer.parseInt(s);
		 Integer s2 = Integer.valueOf(s);
		 
		 // convert5ing from wrapper to string
		 int i6 = 78;
		 Integer i7 = 234;
		 String s3 = Integer.toString(i6);
		 String s4 = i7.toString();
		 
		 
	}

}
