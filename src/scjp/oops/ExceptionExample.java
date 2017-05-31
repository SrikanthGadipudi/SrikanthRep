package scjp.oops;

public class ExceptionExample {
	
	public void add(int a,int b){
		int c = a+b;
		if(c<10){
			throw new CustomException("sum is less than 10");
		}
		else if(c>100){
			
			throw new CustomException("sum is greater than 100");
		}
		else{
			System.out.println(c);
		}
			
		
	}
	

	public static void main(String[] args) {
		
		try{
			ExceptionExample ee = new ExceptionExample();  
			ee.add(67, 8);
		}catch(RuntimeException re){
			re.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
        finally{
        	System.out.println("Finally Block");
        }
	}

}
