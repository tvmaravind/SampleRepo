package exceptionHandlingExample;

public class TryCatchException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		int b = 0;
		
	
		
		
		
		try
		 {
		//	int c = a/b;
			int[] arr = new int[2];
			arr[0] =10;
			arr[1] = 20;
			System.out.println(arr[5]);
		}
		catch(ArithmeticException e2){
			System.out.println("I catched the ArithmeticException");
			
		}
		catch(ArrayIndexOutOfBoundsException e3){
			System.out.println("I catched the ArrayIndexOutOfBoundsException");
			
		}
		catch(Exception e){
			System.out.println("I catched the error/exception");
			
		} 
		finally
		{
			
			System.out.println("Finally block executed.");
		}

		
		
		
		
		
		/*
		catch(ArithmeticException e1){
			System.out.println("I catched the ArithmeticException/exception");
			
		}
	*/	
		
		
		
	
	}
	
}


/*  */






