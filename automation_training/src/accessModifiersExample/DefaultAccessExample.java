package accessModifiersExample;

public class DefaultAccessExample {
	
	int a= 5;
	
	void getdata()
	{
		System.out.println("Default access");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultAccessExample obj1 = new DefaultAccessExample();
		obj1.getdata();
		
	}

}
