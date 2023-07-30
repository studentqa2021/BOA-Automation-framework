package com.testrun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PracticeJavaCOllection {

	public static void main(String[] args) {
		// 11,22,33,44,55
		//create an ArrayList
		List<Integer> myList = new ArrayList<>();//yes
		//List<Integer> myList2 = new List<>(); <== No
		//ArrayList<Integer> myList3 = new ArrayList<>();//yes
		// add value
		myList.add(11);
		myList.add(22);
		myList.add(33);
		myList.add(44);
		myList.add(55);
		myList.add(55);
		myList.add(55);
		myList.add(null);
		myList.add(null);
		// print a list
		System.out.println(myList);
		// how to remove duplicate = Set
		Set<Integer> mySet = new HashSet<>();
		mySet.addAll(myList);
		System.out.println("No dulpicate = "+mySet);
		// count a list
		System.out.println("Count = "+myList.size() );
		// how to get list value based on index =4
		System.out.println(myList.get(4));
		
		//loop a list
		for(int i=0;i<myList.size();i++) {
			System.out.println(myList.get(i));
		}
		
		//max or min
		int max =Collections.max(myList);
		System.out.println("Max value ="+max);
		int min =Collections.min(myList);
		System.out.println("Min value ="+min);
		
		
	}

}
