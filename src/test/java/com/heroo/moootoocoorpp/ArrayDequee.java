package com.heroo.moootoocoorpp;

import java.util.ArrayDeque;

public class ArrayDequee {

	public static void main(String[] args) throws InterruptedException {

		ArrayDeque<String> Name = new ArrayDeque<String>(); // arraydeque use for "first in first out" FIFO
		
		Name.push("Push1");
		System.out.println(Name);
		Thread.sleep(3000);
		Name.push("Push2");
		Name.push("Push3");
		
		System.out.println(Name);
		
		Name.pop();
		System.out.println(Name);
	}

}
