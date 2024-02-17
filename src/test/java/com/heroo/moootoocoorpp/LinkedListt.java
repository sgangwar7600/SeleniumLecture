package com.heroo.moootoocoorpp;

import java.util.LinkedList;

public class LinkedListt {

	public static void main(String[] args) {

		LinkedList<String>  Name = new LinkedList<String>();
		
		Name.add("Shashikant");
		Name.add("Ravi");
		
		System.out.println(Name);

	
		Name.add("Prashant");
		Name.add("Prabhakar");
		
		System.out.println(Name);
		
		Name.addFirst("Elias");
		System.out.println(Name);
		
		Name.addLast("Adam");
		System.out.println(Name);
		
		Name.add(2, "Middle");
		System.out.println(Name);
		
		
		Name.remove();
		System.out.println(Name); //  --- removing from starting
		
		
		Name.remove(3);
		System.out.println(Name);
		
		Name.removeFirst();
		System.out.println(Name);
		
		Name.removeLast();
		System.out.println(Name);
		
		// for each loop for printing the value
		for (String str : Name ) {
			System.out.println(str);
		}
		
		
		
		
	}

}
