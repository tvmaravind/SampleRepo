package accessModifiersExample;

public class PublicAccessExample {
	
	public void getmsg()
	{
		System.out.println("Hello World");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PublicAccessExample obj = new PublicAccessExample();
		obj.getmsg();

	}

}
