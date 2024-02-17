package com.heroo.moootoocoorpp;

import java.util.Stack;

public class Stackk {

	public static void main(String[] args) {


		Stack<String> Namee =  new Stack<String>();
		
		//performing LIFO operation  --- push method for inserting the element/data
		
		Namee.push("Push1");
		Namee.push("Push2");
		Namee.push("Push3");
		
		System.out.println(Namee);
		
		Namee.pop();          // pop using for removing the element/data
		System.out.println(Namee);
		
	}

}
