package com.heroo.moootoocoorpp;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class arraylistt {
	
	
	@Test
	public void methodname() {

		ArrayList<String> Name = new ArrayList<>();
		Name.add("Shashikant");
		Name.add("Ravi");
		
		System.out.println(Name);

	
		Name.add("Prashant");
		Name.add("Prabhakar");
		
		System.out.println(Name);
		
		Name.add( 2, "Gangwar");
		
		System.out.println(Name);
		
		Name.remove(3);
		System.out.println(Name);
		
		Name.set(2, "Prabhakar");
		System.out.println(Name);

		Name.clear();
		System.out.println(Name);
		
	}

}
