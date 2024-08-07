package org.flipkart;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicate {
	public static void main (String[] args) {
		String unique ="";
		String  s ="java programming language";
	Set<Character> remove =new LinkedHashSet<Character> ();
	for(int i=0;i<s.length();i++) {
		char ch =s.charAt(i);
		remove.add(ch);		
	}
	for(char x: remove) {
		unique =unique+x;
	}
	System.out.println(unique);
	}
}
  



