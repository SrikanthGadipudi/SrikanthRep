package scjp.oops;

import java.io.IOException;
import java.io.ObjectInputStream;

public class ObCreationTypes {
	public void test1(int x,int y)
	{
		
		System.out.println(x+y);
	}

	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
		ObCreationTypes o = new ObCreationTypes(); //using new keyword
		o.test1(12, 13);
		o.test1(15, 16);
		//ObCreationTypes o1 =(ObCreationTypes) o.clone(); using clone method
		
		//Class c = Class.forName("scjp.oops.ObCreationTypes"); using  newinstance method
		//ObCreationTypes o2 = (ObCreationTypes)c.newInstance();
		
		//ObjectInputStream o = new ObjectInputStream(null); using deserialization
	   // ObCreationTypes o3 = (ObCreationTypes) o.readObject();
		
		
		
		
		
        
		// TODO Auto-generated method stub

	}

}
