package com.mycompany.it114_final_kifanothomas;

import java.util.ArrayList;
import java.util.List;

public class MyGenericStaticMethodUtilityTester {

	public static <E> void main(String[] args) {
		
		List<String> strings = new ArrayList<String>();
		String s1 = new String("Element_1");
		strings.add(s1);
		System.out.println("add String" + s1 + "now, Strings.size:" + strings);
		int i1 = 1234;
		List<Integer> integer = new ArrayList<Integer>();
		integer.add(i1);
		System.out.println("added Integer" + i1 + "now integers.size" + integer );
		
		

		 
		 
	}

}
