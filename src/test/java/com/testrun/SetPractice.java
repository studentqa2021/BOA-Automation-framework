package com.testrun;

import java.util.Set;
import java.util.TreeSet;

public class SetPractice {
	
	public static void main(String[] args) {
		Set<Integer> mySet =new TreeSet<>();
		mySet.add(2);
		mySet.add(2);
		mySet.add(3);
		//mySet.add(null);
		System.out.println(mySet);
	}

}
