package com.testrun;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
	
	public static void main(String[] args) {
		
		Map<String,String> myMap = new HashMap<>();
		// add value = put()
		myMap.put("Name", "Sarower");
		myMap.put("Salary", "5000");
		myMap.put("Address", "Queens");
		myMap.put("Name", "Salman");
		myMap.put("Name2", "Salman");
		// Limitation of map =duplicate key allow or not = NO
		//to overcome this situation java bring new Map = MultiMap (can handle duplicate keys)
		System.out.println(myMap);
	}

}
