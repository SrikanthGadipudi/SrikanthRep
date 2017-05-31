package scjp.oops;

public class ExtendsAbstractEx1 extends AbstractClassEx {

	


	@Override
	public void s1(int x,int y) {
		
		int z = x-y;
		System.out.println(z);
	}

	@Override
	public void s2(double w,double q) {
		
		
		double a = w/q;
		System.out.println(a);
	}



}
