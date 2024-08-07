package org.flipkart;

public class SingleTon1 {
	
		public static void main(String[] args) {
			singleTon s1 = singleTon.getInstance();
			System.out.println(System.identityHashCode(s1));
			
		}

	}

//1694819250