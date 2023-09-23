package operatorsExample;

public class AssignmentOperatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//(=) operator
		
		/*
		 * Syntax: 
		   num1 = num2;
			
		   Example:
			a = 10;
			ch = 'y';
			*/
		
		// Declaring variables
        int num;
        String name;
 
        // Assigning values
        num = 10;
        name = "automationzerotohero";
 
        // Displaying the assigned values
        System.out.println("num is assigned: " + num);
        System.out.println("name is assigned: " + name);
  
       System.out.println("************************************************************************************");
        
       /* (+=) operator
        
        Syntax: 
        	num1 += num2;
        	
        	Example: 
        	a += 10
        	
        	This means,
        	a = a + 10 */
       
      
        	
        	// Declaring variables
            int num1 = 10, num2 = 20;
     
            System.out.println("num1 = " + num1);
            System.out.println("num2 = " + num2);
     
            // Adding & Assigning values
            num1 += num2;
            //num 1 = num1 +num2;
            //num1 = 10 + 20;
            
     
            // Displaying the assigned values
            System.out.println("num1 = " + num1);
            //30
            
        System.out.println("************************************************************************************");
            
        /*  (-=) operator: 
            
            Syntax: 

            	num1 -= num2;
            	Example: 

            	a -= 10

            	This means,
            	a = a - 10 */
            
            int num3 = 10, num4 = 20;
            
            System.out.println("num3 = " + num3);
            System.out.println("num4 = " + num4);
     
            // Subtracting & Assigning values
            //num3 -= num4;
           // num3 = num3 - num4
            //num3 = 10 - 20;
            //-10
     
            // Displaying the assigned values
            System.out.println("num3 = " + num3);
            
        System.out.println("************************************************************************************");
       
        /* (*=) operator"
        
            Syntax: 

            	num1 *= num2;
            	Example: 

            	a *= 10
            	This means,
            	a = a * 10 */
            
         // Declaring variables
            int num5 = 10, num6 = 20;
     
            System.out.println("num5 = " + num5);
            System.out.println("num6 = " + num6);
     
            // Multiplying & Assigning values
            num5 *= num6;
     
            // Displaying the assigned values
            System.out.println("num5 = " + num5);
            
       System.out.println("************************************************************************************");

           /* (/=) operator: 
            	 Syntax: 
            		num1 /= num2;
            		
            		Example: 
            		a /= 10
            		
            		This means,
            		a = a / 10 		*/
            	
            	// Declaring variables
                int num7 = 20, num8 = 10;
         
                System.out.println("num7 = " + num7);
                System.out.println("num8 = " + num8);
         
                // Dividing & Assigning values
                num7 /= num8;
         
                // Displaying the assigned values
                System.out.println("num7 = " + num7);
                
        System.out.println("************************************************************************************");       
               
        	/* (%=) operator:  
                Syntax: 
                	num1 %= num2;
                	
                	Example: 
                	a %= 3

                	This means,
                	a = a % 3 */
                
             // Declaring variables
                int num9 = 5, num10 = 3;
         
                System.out.println("num9 = " + num9);
                System.out.println("num10 = " + num10);
         
                // Moduling & Assigning values
                num9 %= num10;
         
                // Displaying the assigned values
                System.out.println("num9 = " + num9);
               
          System.out.println("************************************************************************************");              
	}

}
