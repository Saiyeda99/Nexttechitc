package com.nexttech.Javapractice_NexttechITC;

import java.util.HashMap;

public class Lec5Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a HashMap object with variable cities and State
		//HashMap<key,value>variable=new HashMap<key, value>();
		HashMap<String,String>CapitalCities= new HashMap<String, String>();
		
		HashMap<String, String>statecity=new HashMap<String, String>();
		//*how to add data in HashMap
		statecity.put("NY","Queens");
		statecity.put("GA","Lawrenceville");
		statecity.put("CA","LA");
		statecity.put("GA","Norcross");
		statecity.put("GA", "Dulluth");
				//GA is Key and Lawrenceville is value
		System.out.println(statecity);
		
		//*access item in HashMap
		statecity.get("GA");
		System.out.println(statecity.get("GA"));
		statecity.get("NY");
		System.out.println(statecity.get("NY"));
		statecity.get("CA");
		System.out.println(statecity.get("CA"));
		
		//remove :variable.remove("key");
		statecity.remove("GA");
		System.out.println(statecity);
		
		
		// HW: difference between ArrayList And HashMap
		
		
		
		
		
		
		
		
		

	}

}
