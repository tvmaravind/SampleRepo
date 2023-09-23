package conditionalStatementsExample;

//Java Program to demonstrate the use of If else-if ladder.  
//It is a program of grading system for fail, D grade, C grade, B grade, A grade and A+.  
public class IfElseIfExample {  
public static void main(String[] args) {  
  int marks=200;  
 
  
  if(marks<50){  
      System.out.println("fail");  //false
  }  
  else if(marks>=50 && marks<60){  // 65 > =50 && 65 <60 -> true && false -> false
      System.out.println("D grade");  
  }  
  else if(marks>=60 && marks<70){   // 65 > = 60 && 65 < 70 -> true && true - > true
      System.out.println("C grade");  
  }  
  else if(marks>=70 && marks<80){  
      System.out.println("B grade");  
  }  
  else if(marks>=80 && marks<90){  
      System.out.println("A grade");  
  }else if(marks>=90 && marks<100){  
      System.out.println("A+ grade");  
  }else{  
      System.out.println("Invalid!");  
  }  
}  
}  





/*

if(condition1){  
//code to be executed if condition1 is true  
}else if(condition2){  
//code to be executed if condition2 is true  
}  
else if(condition3){  
//code to be executed if condition3 is true  
}  
...  
else{  
//code to be executed if all the conditions are false  
}  


*/