package scjp.oops;

public class StringClass {
  
	public static void main(String[] args) {
		String st = new String("Srikanth");
		String sts = new String("Srikanth");
		String st2 = st.concat("Srilakshmi");
		//st.concat("Srilakshmi");
        System.out.println(st2);
		StringBuffer st1 = new StringBuffer("Srikanth");
		StringBuffer st3 = new StringBuffer("Srikanth");
		////st1.append("Srilakshmi");
        System.out.println(st1);
               
        System.out.println(st.equals(sts));
        System.out.println(st==sts);
        System.out.println(st1.equals(st3));
        System.out.println(st1==st3);
	}

}
