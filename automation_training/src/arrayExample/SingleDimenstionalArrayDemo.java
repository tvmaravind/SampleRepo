package arrayExample;

public class SingleDimenstionalArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		int[] arr = new int[5];

		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		for(int i=0; i<arr.length; i++) // i =0 ; i<=4 ; i++
		{
			System.out.println(arr[i]); // arr[0] -> 1
										// arr[1] -> 2
										// arr[2] -> 3
										// arr[3] -> 4
										// arr[4] -> 5
		}
		
		
		
		
		
		
		
		
		
		//System.out.println(arr[4]);
		
		System.out.println("***************************************************************");
		
		
		int[] arr1 = {1,2,3,4,5,6,7,8,10};
		System.out.println("length of the array"+arr1.length);
		
		
		System.out.println(arr1[0]);
	
		
		
		System.out.println("***************************************************************");
		
		
		
		
		
		
		
		
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
		
		
		
		
		
		
		
		
		
		System.out.println("***************************************************************");
		
		
		
		String[] name = {"abc","def","hij"};
		for(int i = 0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		
		System.out.println("***************************************************************");
		
		
	}

}
