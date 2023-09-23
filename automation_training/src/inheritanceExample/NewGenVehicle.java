package inheritanceExample;

public class NewGenVehicle extends ExistingVehicle{
	
	
	public void engine()
	{
		System.out.println("New Engine");
	}
	
	
	public void color()
	{
		System.out.println(Color);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewGenVehicle obj = new NewGenVehicle();
		obj.brakes();
		obj.audiosystem();
		obj.Gear();
		obj.engine();
		obj.color();

	}

}
