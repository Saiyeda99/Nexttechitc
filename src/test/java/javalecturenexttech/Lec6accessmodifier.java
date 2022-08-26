package javalecturenexttech;

 public class Lec6accessmodifier {
//public access modifier
	public int num1=20;
	
//default modifier
	int num2=23;
	
	//private 
	private int num3=40;
	
	// how to create a method:- Accessmodifier returntype methodname(){}
	public void fbsignin() {
		
	}
	
	private void fbsigin1() {
		
	}
	void fbsignup() {
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=10;
		String flower="rose";
		
		
	//opp-object oriented programing
		
	//to create an object? syntax is - classname objectname=new classname();
								Lec6accessmodifier myobj=new Lec6accessmodifier();
	   //myobj.num1;
		System.out.println(myobj.num1);
		//myobj.num2
		System.out.println(myobj.num2);
		//myobj.num3
		myobj.fbsignin();
		myobj.fbsigin1();
		myobj.fbsignup();
	
		
			
	
		
		
		
		
	}

	private static void Fbsigup() {
		// TODO Auto-generated method stub
		
	}

	private static void Fbsignin() {
		// TODO Auto-generated method stub
		
	}

}
