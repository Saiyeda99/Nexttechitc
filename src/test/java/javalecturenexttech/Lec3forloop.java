package javalecturenexttech;

public class Lec3forloop {

	public static void main(String[] args) {
		/* increment
		increment by 1= i++ or i=i+1;
		increment by 2= i+=2 or i=i+2;
		increment by 3= i+=3 or i=i+3;
		*/
		int a=10; 
		
	    a++;//increment by 1
		System.out.println(a);
		
		a=a+2;//increment by 2
		System.out.println(a);
		
		/*The example below will print the number 0 to 9
		for(statement 1; statement 2; statement 3) {
			code block to be executed
		}
		
		*/
		for(int i=0; i<10; i++) {
			System.out.println("the result is: "+i);
			
		}
		
		//print even numbers from 0 to 20
		for (int i=0; i<=20; i+=2) {
			System.out.println("the number is even:" +i);

		}
		//print odd numbers from 4 to 30
		for (int j=5; j<=30; j+=2) {
			System.out.println("the number is odd " +j);
		
		}

	}

}
