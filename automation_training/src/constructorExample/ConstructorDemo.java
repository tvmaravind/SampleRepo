package constructorExample;

public class ConstructorDemo {
	
	public ConstructorDemo()
	{
		System.out.println("I am in the Constructor");
	}
	
		public ConstructorDemo(int a, int b)
	{
		System.out.println("I am in the integer parametrized Constructor");
		System.out.println(a+b);
	}
		
		public ConstructorDemo(int a, int b, int c)
		{
			System.out.println("I am in the integer parametrized Constructor");
			System.out.println(a+b);
		}
	
	public ConstructorDemo(String str)
	{
		System.out.println("I am in the string parametrized Constructor");
	}
	
	public void getdata()
	{
		System.out.println("I am in the method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ConstructorDemo cd = new ConstructorDemo();
		//ConstructorDemo cd1 = new ConstructorDemo(2,3);
		//ConstructorDemo cd2 = new ConstructorDemo("hello");
	
	ConstructorDemo obj = new ConstructorDemo();
	obj.getdata();
		
	}

}
