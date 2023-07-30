package com.java.collection.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class PracticeCollection {

	
	
	public static void main(String[] args) {
		//OOPS = object <== Class
		//Collection = Object <== Class
		// special class (wrapper class)
			// number = Intiger (int)
			// fraction = Double (double)
			// conditon = Boolean (boolean)
		
		
//		List<Integer> myLinkedList = new LinkedList<>();
//		List<Integer> myVector = new Vector<>();
//		List<Integer> myStack = new Stack<>();
		
		
		Integer [] b = {33,44,55,66};
		List<Integer> myArrayList = new ArrayList<>();
		myArrayList.add(10);//0
		myArrayList.add(20);//1
		myArrayList.add(30);//2
		myArrayList.addAll(Arrays.asList(b));
		
		for(int i=0;i<myArrayList.size();i++) {
			System.out.println(myArrayList.get(i));
		}
//		
//		for(Integer v:myArrayList) {
//			System.out.println(v);
//		}
		
		myArrayList.forEach(v -> System.out.println(v));
		
		
		System.out.println(myArrayList);
		System.out.println("Count = "+myArrayList.size());
		System.out.println("found value based on index = "+myArrayList.get(1));
		
		
//		Integer [] a= {2,3,4,5};
//		List<Integer> myList2 = Arrays.asList(a);
//		System.out.println(myList2);
		
		
		
		
	}
}
