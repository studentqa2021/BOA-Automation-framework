package com.testrun;

import java.util.ArrayList;
import java.util.List;

public class TwoListPractice {
	
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		myList.add(11);
		myList.add(22);
		myList.add(33);
		System.out.println("List 1 = "+myList);
		
		List<Integer> myList2 = new ArrayList<>();
		myList2.add(2);
		myList2.add(22);
		myList2.add(3);
		System.out.println("List 2 = "+myList2);
		
		// which value are common from both list
		myList.retainAll(myList2);
		System.out.println("Common value from both list = "+myList);
		
		// how to check both list value are same or not

		
		if(myList.equals(myList2)) {
			System.out.println("Both list are the same");
		}else {
			System.out.println("Both list are not the same");
		}
		
	}

}
