package classAndObjectsExample;

public class Facebook_Account_Details {
	
	public void account_details()
	{
		String username = "rohit";
		int age = 25;
		String gender = "male";
		System.out.println(" username: "+username+" age: "+age+" gender: "+gender);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facebook_Account_Details obj1 = new Facebook_Account_Details();
		obj1.account_details();
		
		SQLDatabase obj2 = new SQLDatabase();
		int emp = obj2.empid;
		System.out.println(emp);
		
	
		
		
	}

}
