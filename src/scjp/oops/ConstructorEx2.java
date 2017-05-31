package scjp.oops;

public class ConstructorEx2 {
	String studName;
	int rollNo;
	public ConstructorEx2()
	{
		System.out.println(studName + " " + rollNo);
	}
    public ConstructorEx2(String stuName,int rolNo)
    {

    	this.studName = stuName;
    	this.rollNo = rolNo;
    	System.out.println(studName + " " + rollNo);
    }
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
	ConstructorEx2 s = new ConstructorEx2();
    ConstructorEx2 s1 = new ConstructorEx2("Srikanth",101);
    ConstructorEx2 s2 = new ConstructorEx2("Ravinadh",102);
    
	}

}
