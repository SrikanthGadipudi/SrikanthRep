package scjp.oops;

public class StringExample1 {


	public static void main(String[] args) {
	    int i = 0;
	    int i1=0;
	    Integer i2 = new Integer(0);
	    Integer i3 = new Integer(0);
	    
	    System.out.println(i==i1);
	    System.out.println(i2.equals(i3));	    
		String s1 = new String("Test Srikanth Virtusa POLARIS");
        String s2 = "https://site03.remoteoffice.citigroup.com/dana-na/auth/url_default/welcome.cgi";
        String s3 = "Test Srikanth Virtusa POLARIS";
        String s4 = new String("Test Srikanth Virtusa POLARIS");
        StringBuffer a1 = new StringBuffer("Test Srikanth Virtusa POLARIS");
       
        System.out.println(s1==s4);        
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s3));
        System.out.println(s1==s3);
        s1.concat(".com");
        a1.append(".com");
        System.out.println(s1);
        System.out.println(a1);
        if(!s1.equals(s3)){
        	System.out.println("Success");
        }
        else
        {
        	System.out.println("Failure");
        }
	}

}
