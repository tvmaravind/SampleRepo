package accessModifiersExample;

public class Access1 {

	public int a = 5;
	
	public void abc() {
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Access1 obj = new Access1();
		int b = obj.a;
		obj.abc();
	}

}
