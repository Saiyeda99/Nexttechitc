package javalecturenexttech;

public class Lec6accessmodifierpractise {

	private String city="NY";
	//default
	String city1="GA";
	public String city2="LA";
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create an object
		Lec6accessmodifierpractise myobj=new Lec6accessmodifierpractise();
		System.out.println(myobj.city);
		System.out.println(myobj.city1);
		System.out.println(myobj.city2);
		
	}

}
