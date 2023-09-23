package inheritanceExample;

public class ChildClassDemo extends ParentClassDemo{
	
	public void color()
	{
		System.out.println(color);
	}

	public void engine()
	{
		System.out.println("engine code");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClassDemo obj = new ChildClassDemo();
		obj.gear();
		obj.brake();
		obj.color();
		obj.engine();
		

	}

}
