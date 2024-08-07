package org.flipkart;

public class singleTon {
	
		private singleTon() {}
		
		public static singleTon s1 = null;
		
		public static singleTon getvalue() {
			if(s1==null) {
				s1= new singleTon();
			}
			return s1;
			}
		public static void main(String[] args) {
			singleTon s = new singleTon();
			System.out.println(System.identityHashCode(s));
			
		}
	}
		
//  515132998