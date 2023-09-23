package InterfaceExample;

public class AustralianTraffic implements CentralTraffic, ContinentalTraffic{

	public static void main(String[] args) {
		
		CentralTraffic obj = new AustralianTraffic();
		obj.flashYellow();
		obj.redStop();
		obj.greenGo();
		
		
		AustralianTraffic obj1 = new AustralianTraffic();
		obj1.walkonsymbol();
		
		ContinentalTraffic obj2 = new AustralianTraffic();
		obj2.trainsymbol();
		
		
		// TODO Auto-generated method stub

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Greengo code");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Redstop code");
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("flashyellow code");
		
	}
	
	public void walkonsymbol() {
		// TODO Auto-generated method stub
		System.out.println("walkonsymbol code");
		
	}

	@Override
	public void trainsymbol() {
		// TODO Auto-generated method stub
		System.out.println("trainsymbol code");
		
		
	}
	

}
