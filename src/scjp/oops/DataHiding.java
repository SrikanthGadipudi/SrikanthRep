package scjp.oops;

public class DataHiding {
	private double balance = 500.005;
    public double getBalance()
    {
    	
    	return balance;
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	DataHiding h = new DataHiding();
    	System.out.println(h.getBalance());
	}

}
