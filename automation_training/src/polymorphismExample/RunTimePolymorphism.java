package polymorphismExample;


class Bird
{
	public void sing()
	{
		System.out.println("tweet tweet tweet");
	}
}


class duck extends Bird
{
	public void sing()
{
		//System.out.println("quack quack quack");
	//}
}









class crow extends Bird
{
	public void sing()
	{
		System.out.println("caw caw caw");
	}
}





public class RunTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//crow obj = new crow();
		//obj.sing();
		
		
		duck b = new duck();
		b.sing();
	}
}}