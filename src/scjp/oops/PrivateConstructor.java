package scjp.oops;

public class PrivateConstructor {
	private static PrivateConstructor pc =null;
	
	private PrivateConstructor(){
		
		
	}
   public static PrivateConstructor creteInstance() {
	   if(pc == null){
		    pc = new PrivateConstructor();
		   return pc; 
	   }else{
		   return pc; 
	   }
	  
   }
}
