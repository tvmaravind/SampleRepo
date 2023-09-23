package conditionalStatementsExample;

//Java Program to demonstrate the use of Nested If Statement.  
public class NestedIfExample {    
public static void main(String[] args) {    
  //Creating two variables for age and weight  
  int age=10;  
  int weight=80;    
  //applying condition on age and weight  
  if(age>=18){    //10 > 18 -> false
      if(weight>50){  
          System.out.println("You are eligible to donate blood");  
      }    
  }    
}}  


/*

if(condition){    
//code to be executed    
     if(condition){  
        //code to be executed    
}    
}  

*/