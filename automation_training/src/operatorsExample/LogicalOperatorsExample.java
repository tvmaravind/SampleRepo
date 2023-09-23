package operatorsExample;

public class LogicalOperatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Logical operators
        boolean x = true;
        boolean y = false;
       
        int a = 10;
        int b = 3;
        int c = 5;
        
       // System.out.println((a > b) && (b > c)); // true
        // true && false -> false
        
        
       // System.out.println((a > b) || (b > c));
       // true || false -> true
        
        System.out.println(!(a > b));
        
        
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
	}

}
