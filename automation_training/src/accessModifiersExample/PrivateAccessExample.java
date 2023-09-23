package accessModifiersExample;

public class PrivateAccessExample {
	
	private void getmessage()
	{
		System.out.println("Private Acess");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateAccessExample obj1 = new PrivateAccessExample();
		obj1.getmessage();

	}

}
