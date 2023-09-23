package arrayListExample;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String[] fruits = new String[3];
		//fruits[0] = "Mango";
		//fruits[1] = "Apple";
	
		
		//System.out.println(fruits[1]);
		
	
		
		ArrayList<String> fruitlist = new ArrayList<String>();
		fruitlist.add("Mango");
		fruitlist.add("Apple");
		fruitlist.add("Strawberry");
		
		//fruitlist.clear();
		
		System.out.println(fruitlist.contains("Grapes"));
		
	}

}
