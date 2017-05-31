package scjp.oops;

public class MainOverloadingEx1 {

	public static void main(String[] args) {
		OverloadingEx1 ol = new OverloadingEx1();
		ol.s1(10, "Srikanth");
		ol.s1(10.5, 123f);
		OverloadingEx2.m1("Ravi");
		OverloadingEx2.m1("Ravi",22,234);

	}

}
