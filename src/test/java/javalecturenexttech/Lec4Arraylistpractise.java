package javalecturenexttech;

import java.util.ArrayList;

public class Lec4Arraylistpractise {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		// arraylist is resizable, not fixed
		
		//syntax : ArrayList<datatype> variable name=new ArrayList<datatype>();
		
		//create an ArrayList object
		ArrayList<Integer> cars=new ArrayList<Integer>();
		
		//write ArrayList code to store flowers
		ArrayList<String>Flowers=new ArrayList<String>();
		
	
		
//add the data in ArrayList: variable.add("data");
		Flowers.add("rose");
		Flowers.add("sunflower");
		
//access 
		Flowers.get(1);
//change item in ArrayList, we use set method
		Flowers.set(0,"Bentley");
//remove item
		Flowers.remove(2);
//if want to clear, we do not clear everything
		Flowers.clear();
//size of arraylist
		Flowers.size();
		
		
		//HW difference between Array and arraylist
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
