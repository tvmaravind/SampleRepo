package polymorphismExample;

class add{
	
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	

}

public class CompileTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add obj = new add();
		obj.add(10, 20);
		obj.add(10, 20, 30);

	}

}
