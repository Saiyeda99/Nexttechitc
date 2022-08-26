package Javatestp;

import javalecturenexttech.Lec6accessmodifier;

public class Accessmodifiertest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lec6accessmodifier myobj=new Lec6accessmodifier();
		System.out.println(myobj.num1);
		
		myobj.fbsignin();
		//because fbsignin was public class thats why it is accessible from another class under different package.
	}

}
