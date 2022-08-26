package javalecturenexttech;

import java.util.ArrayList;

public class Schoolpractise {
//author: Saiyeda Fatema
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>class6=new ArrayList<String>();
ArrayList<String>class7=new ArrayList<String>();
ArrayList<String>class8=new ArrayList<String>();
ArrayList<String>class9=new ArrayList<String>();
ArrayList<String>class10=new ArrayList<String>();
// add students class 6
class6.add("A");
class6.add("B");
class6.add("C");
//add students in class 7
class7.add("D");
class7.add("E");
class7.add("F");
class7.add("G");
//add students in class 8
class8.add("H");
class8.add("J");
class8.add("K");
class8.add("L");
class8.add("A");
//add students in class 9
class9.add("M");
class9.add("N");
class9.add("P");
class9.add("Q");
class9.add("R");
//add students in class 10
class10.add("B");
class10.add("F");
class10.add("S");
class10.add("T");
class10.add("U");
class10.add("V");
class10.add("Y");
class10.add("Z");

//R1: what is the number of students of class 9?
class9.size();
System.out.println(" total students in class9:"+class9.size());
System.out.println("total students C10:"+class10.size());
System.out.println("total students in C7:" +class7.size());

//R2: what is number of students in entire school?
int totalstudents=class6.size()+class7.size()+class8.size()+class9.size()+class10.size();
System.out.println("R2: totalstudents:"+ totalstudents);

//R3: print the list of students in class 6
class6.size();
System.out.println("R3: list of the students in class6:"+ class6);
System.out.println("List of students in class8:"+ class8);
System.out.println("List of students in class7:"+class7);
System.out.println("List of students in class9:" +class9);


//R4:print the list of students of entire school
System.out.println("R4: print the list of students of entire school"+class6+class7+class8+class9+class10);







	}

}
