package methodExample;

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*obj.getData();
		
		*/
		
		 getData2();
		
		 MethodDemo1 obj1 = new MethodDemo1();
			obj1.getData();
		
		//String message = obj.getData1();
		//System.out.println(message);
		
		/*MethodDemo1 obj1 = new MethodDemo1();
		obj1.getData();
		getData2();
		
		
		
		
		
			*/	
		
		MethodDemo obj = new MethodDemo();
		int total = obj.sum(2, 3);
		System.out.println(total);

	}
	
	
	public int sum(int a , int b)
	{
		int sum = a + b;
		return sum;
	}
	
	public void getData()
	{
		System.out.println("Hello World!!! getData()");
	}
	
	
	
	
	
	public String getData1()
	{
		System.out.println("Hello World!!! getData1()");
		return "success";
	}
	
	public static void getData2()
	{
		System.out.println("Hello World!!! getData2()");
	}
	
	

}
