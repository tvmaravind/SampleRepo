package operatorsExample;
import java.util.Scanner;
public class ArithmeticsOpeartorsExample {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	 
	        System.out.print("Enter the first number: ");
	        int num1 = sc.nextInt();
	 
	        System.out.print("Enter the second number: ");
	        int num2 = sc.nextInt();
	       
	        double sum = num1 + num2; //15
	        double difference = num1 - num2; //5
	        double product = num1 * num2; //50
	        double quotient = num1 / num2; //2
	        double remainder = num1 % num2; //0
	 
	        System.out.println("The sum of the two numbers is: " + sum);
	        System.out.println("The difference of the two numbers is: " + difference);
	        System.out.println("The product of the two numbers is: " + product);
	        System.out.println("The quotient of the two numbers is: " + quotient);
	        System.out.println("The remainder of the two numbers is: " + remainder);
	    }
	}


/* Note:	
	nextBoolean()	Reads a boolean value from the user
	nextByte()	Reads a byte value from the user
	nextDouble()	Reads a double value from the user
	nextFloat()	Reads a float value from the user
	nextInt()	Reads a int value from the user
	nextLine()	Reads a String value from the user
	nextLong()	Reads a long value from the user
	nextShort()	Reads a short value from the user
*/