package abstractExample;

public class ChildEmirates extends ParentAirCarft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildEmirates obj = new ChildEmirates();
				obj.bodycolor();
		obj.engine();
		obj.safetyguidelines();

	}

	@Override
	public void bodycolor() {
		// TODO Auto-generated method stub
		System.out.println("Red color on the body");
	}

}
