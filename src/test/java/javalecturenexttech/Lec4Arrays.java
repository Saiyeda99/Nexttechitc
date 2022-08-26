package javalecturenexttech;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lec4Arrays {

	public static void main(String[] args) {
			// store single data in single variable
		String flower="rose";
			//arrays where we store multiple data in single variable
			//String [] car;
		
			//String [] car; data type[] variables={"data1","data2","data3"};
		String [] car= {"nissan","Toyota","BMW"};
		
			//array is fixed,we can not add anymore value or data later
			//when we store any data in array, we store in index. index starts from 0
		//access data  Array
		
		
		// store 4 flowers name in flowers variable
		String[] carflowers= {"rose","lilly","tulip","nightqueen"};
		
		//store numbers 1 to 5 by using array
		int[] number= {1,2,3,4,5};
//access data
		//carflowers[0];
		System.out.println(carflowers[0]);
		System.out.println(carflowers[1]);
		System.out.println(carflowers[2]);
		System.out.println(carflowers[3]);
		
//change the data, variable[indexnumber]="new item";
		String[]Fruits= {"mango","watermelon","orange","apple"};
		Fruits[1]="jackfruits";
		System.out.println(Fruits[1]);
		Fruits[2]="Cherry";
		System.out.println(Fruits[2]);
		
		System.out.println(Arrays.toString(Fruits));
		//assingment exchange jackfruits with watermelon
		Fruits[3]="jackfruits";
		System.out.println(Fruits[3]);
		
//length of Array: variable.length: (fruits.length)
		System.out.println(Fruits.length);
		
		
		
	
		
		

	}

}